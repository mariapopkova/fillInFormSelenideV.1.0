import enums.Gender;
import enums.Hobby;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee{
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobilePhone;
    private LocalDate dob;
    private String subject;
    protected Hobby hobby;
    private String picture;
    private String currentAddress;
    private String state;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public LocalDate getDob() { return dob; }

    public String getSubject() { return subject; }

    public Hobby getHobby() { return hobby; }

    public String getPicture() { return picture; }

    public String getCurrentAddress() { return currentAddress; }

    public String getState() { return state; }

    public String getCity() { return city; }

    private String[] firstNameArray = {"Alex", "Victor", "Martin"};

    public String selectedStringValueFromArray(String[] array){
        return array[(int)Math.floor(Math.random() * array.length)];
    }

    private String[] lastNameArray = {"Ivanov", "Voronin", "Shpak"};

    private String generateEmail(){
        return this.firstName + this.lastName + "@fake.com";
    }

    private Gender generateGender(){
        return Gender.values()[(int)Math.floor(Math.random() * Gender.values().length)];
    }

    public String getDobAsString(){
        String europeanDatePattern = "dd MMM yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        europeanDateFormatter.localizedBy(Locale.UK);
        return europeanDateFormatter.format(this.dob);}

    private Hobby generateHobby(){
        return Hobby.values()[(int)Math.floor(Math.random() * Hobby.values().length)];
    }

    private Map<String, List<String>> mapCityState = new HashMap<String, List<String>>(){{
       put("NCR", Arrays.asList("Delhi", "Gurgaon", "Noida"));
       put("Haryana", Arrays.asList("Karnal","Panipat"));
    }};

    private String generateState(){
        return mapCityState.keySet().toArray()[(int)Math.floor(Math.random() * mapCityState.keySet().size())].toString();
    }

    private String generateCity(){
        List <String> list = mapCityState.get(this.state);
        return list.get((int)Math.floor(Math.random() * list.size()));
    }




    public Employee(){
        this.firstName = this.selectedStringValueFromArray(this.lastNameArray);
        this.lastName = this.selectedStringValueFromArray(this.lastNameArray);
        this.email = this.generateEmail();
        this.gender = this.generateGender();
        this.mobilePhone = "111111111111";
        this.dob = LocalDate.now().minusYears(18).minusMonths(6).minusDays(12);
        this.subject = "Maths";
        this.hobby = this.generateHobby();
        this.picture = "C:/Users/maria/Pictures/picture.PNG";
        this.currentAddress = "Ulitsa adresnaya, 1";
        this.state = this.generateState();
        this.city = this.generateCity();
    }

}
