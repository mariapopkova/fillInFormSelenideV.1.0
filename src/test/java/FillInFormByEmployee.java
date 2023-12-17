import Pages.PracticeFormElements;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FillInFormByEmployee {

    public FillInFormByEmployee(String url){
        Selenide.open(url);
    }
    PracticeFormElements practiceFormElements = new PracticeFormElements();

    public String fillInForm(){
        Employee employee = createEmployee(1);
    practiceFormElements.firstNameField().sendKeys(employee.getFirstName());
    practiceFormElements.lastNameField().sendKeys(employee.getLastName());
    practiceFormElements.emailField().sendKeys(employee.getEmail());
    setRadioButton(practiceFormElements.radioButtonForMale(), practiceFormElements.radioButtonValueForMale(), employee.getGender().label);
    setRadioButton(practiceFormElements.radioButtonForFemale(), practiceFormElements.radioButtonValueForFemale(), employee.getGender().label);
    setRadioButton(practiceFormElements.radioButtonForOther(), practiceFormElements.radioButtonValueForOther(), employee.getGender().label);
    practiceFormElements.mobileField().sendKeys(employee.getMobilePhone());
    practiceFormElements.dateOfBirthField().click();
    setMonth(getMonthOfBirthString(employee.getDobAsString()));
    setYear(employee.getDobAsString());
    setDay(getDayOfBirthString(employee.getDobAsString()));
    buildSubject(employee.getSubject());
    setCheckBox(practiceFormElements.checkboxForSports(), practiceFormElements.checkboxValueForSports(),employee.getHobby().label);
    setCheckBox(practiceFormElements.checkboxForReading(), practiceFormElements.checkboxValueForReading(),employee.getHobby().label);
    setCheckBox(practiceFormElements.checkboxForMusic(), practiceFormElements.checkboxValueForMusic(),employee.getHobby().label);
    practiceFormElements.pictureUploadButton().sendKeys(employee.getPicture());
    practiceFormElements.currentAddressField().sendKeys(employee.getCurrentAddress());
    setStateAndCity(employee.getState(), employee.getCity());
    practiceFormElements.submitButton().click();
    return practiceFormElements.popupTitle().getText();
    }
    private Employee createEmployee(int val){
        switch (val){
            case 1: return new ChiefGenerator().createEmployee();
            case 2: return new WorkerGenerator().createEmployee();
            default: return new CleanerGenerator().createEmployee();
        }

    }

    private void setRadioButton(WebElement radiobutton, WebElement radiobuttonValue, String generatedValue){
        if(radiobuttonValue.getText().contains(generatedValue)){
            radiobutton.click();
        }
    }
    private String getMonthOfBirthString(String dob){
        String monthString = dob.substring(3,6);
        return monthString;
    }
    private void setMonth (String dob) {
        practiceFormElements.monthField().click();
        ElementsCollection options = practiceFormElements.monthOptions();
        for(WebElement option : options)
        {
            if (option.getText().contains(dob))
            {
                option.click();
                break;
            }
        }
    }
    private void setYear (String dob) {
        practiceFormElements.yearField().click();
        ElementsCollection options = practiceFormElements.yearOptions();
        for(WebElement option : options) {
            if (dob.contains(option.getText())) {
                option.click();
                break;
            }
        }

    }
    private String getDayOfBirthString(String dob){
        String dayString = dob.substring(0,2);
        return dayString;
    }
    private void setDay (String dayString) {
        ElementsCollection allDates = practiceFormElements.dayOptions();
        for(WebElement day : allDates)
        {
            if (dayString.contains(day.getText()))
            {
                day.click();
                break;
            }
        }
    }
    private void buildSubject(String val){
        WebElement element = practiceFormElements.subjectsField();
        element.sendKeys(val);
        element.sendKeys(Keys.ENTER);
    }
    private void setCheckBox(WebElement checkbox, WebElement checkboxValue, String generatedValue){
        if(checkboxValue.getText().contains(generatedValue)){
            checkbox.click();
        }
    }
    private void setStateAndCity(String state, String city){
        WebElement stateElement = practiceFormElements.stateDropdown();
        stateElement.sendKeys(state);
        stateElement.sendKeys(Keys.ENTER);
        WebElement cityElement = practiceFormElements.cityDropdown();
        cityElement.sendKeys(city);
        cityElement.sendKeys(Keys.ENTER);
    }
}
