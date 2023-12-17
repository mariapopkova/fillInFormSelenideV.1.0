package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormElements {
    public SelenideElement firstNameField(){
        return  $("#firstName");
    }

    public SelenideElement lastNameField(){
        return $("#lastName");
    }

    public SelenideElement emailField(){
        return $("#userEmail");
    }

    public SelenideElement radioButtonForMale(){
        return $x("//label[text()='Male']");
    }

    public SelenideElement radioButtonValueForMale(){
        return $("label[for='gender-radio-1']");
    }

    public SelenideElement radioButtonForFemale(){
        return $x("//label[text()='Female']");
    }

    public SelenideElement radioButtonValueForFemale(){
        return $("label[for='gender-radio-2']");
    }

    public SelenideElement radioButtonForOther(){return $x("//label[text()='Other']");}

    public SelenideElement radioButtonValueForOther(){
        return $("label[for='gender-radio-3']");
    }

    public SelenideElement mobileField(){
        return $("#userNumber");
    }

    public SelenideElement dateOfBirthField(){
        return $("#dateOfBirthInput");
    }

    public SelenideElement monthField(){
        return $("div[class ='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']");
    }

    public ElementsCollection monthOptions(){
        return $$("div[class ='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select'] option");
    }

    public SelenideElement yearField(){
        return $("div[class ='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']");
    }

    public ElementsCollection yearOptions(){
        return $$("div[class ='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select'] option");
    }

    public ElementsCollection dayOptions(){
        return $$x("//div[@class = 'react-datepicker__week'] //div");
    }

    public SelenideElement subjectsField(){
        return $("#subjectsInput");
    }

    public SelenideElement checkboxForSports(){
        return $x("//label[text()='Sports']");
    }

    public SelenideElement checkboxValueForSports(){
        return $("label[for='hobbies-checkbox-1']");
    }

    public SelenideElement checkboxForReading(){
        return $x("//label[text()='Reading']");
    }

    public SelenideElement checkboxValueForReading(){
        return $("label[for='hobbies-checkbox-2']");
    }

    public SelenideElement checkboxForMusic(){
        return $x("//label[text()='Music']");
    }

    public SelenideElement checkboxValueForMusic(){
        return $("label[for='hobbies-checkbox-3']");
    }

    public SelenideElement pictureUploadButton(){
        return $("#uploadPicture");
    }

    public SelenideElement currentAddressField(){
        return $("#currentAddress");
    }

    public SelenideElement stateDropdown(){
        return $("#react-select-3-input");
    }

    public SelenideElement cityDropdown(){
        return $("#react-select-4-input");
    }

    public SelenideElement submitButton() {return $("#submit");}

    public SelenideElement popupTitle(){
        return $("#example-modal-sizes-title-lg");
    }



}
