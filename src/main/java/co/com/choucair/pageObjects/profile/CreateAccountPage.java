package co.com.choucair.pageObjects.profile;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    public int timeMilliseconds = 3000;
    private SelenideElement createAccountMessage =$(byText("Create an account"));
    private SelenideElement titleRadioButton = $(byId("id_gender1"));
    private SelenideElement firstnameText = $(byId("customer_firstname"));
    private SelenideElement lastnameText = $(byId("customer_lastname"));
    private SelenideElement passwordText = $(byId("passwd"));
    private SelenideElement daySelect = $(byId("days"));
    private SelenideElement monthSelect = $(byId("months"));
    private SelenideElement yearSelect = $(byId("years"));
    private SelenideElement firstNameDirText = $(byId("firstname"));
    private SelenideElement lastNameDirText = $(byId("lastname"));
    private SelenideElement companyText = $(byId("company"));
    private SelenideElement addressText = $(byId("address1"));
    private SelenideElement cityText = $(byId("city"));
    private SelenideElement stateSelect = $(byId("id_state"));
    private SelenideElement zipCodeText = $(byId("postcode"));
    private SelenideElement countrySelect = $(byId("id_country"));
    private SelenideElement phoneText = $(byId("phone"));
    private SelenideElement mobilePhoneText = $(byId("phone_mobile"));
    private SelenideElement addressAliasText = $(byId("alias"));
    private SelenideElement registerButton = $(byId("submitAccount"));


    public String firstName = "firstName";
    public String lastName = "lastName";
    public String password = "123456";
    public String day = "10";
    public String month = "3";
    public String year = "1980";
    public String company = "companytest";
    public String address = "avenue 123";
    public String city = "Manhattan";
    public String state = "32";
    public String zip = "12345";
    public String country = "21";
    public String homePhone = "0234567891";
    public String mobilePhone = "0234567891";
    public String alias = "avenue 124";

    public CreateAccountPage validateCreateAccountMessage(){
        try{
            Thread.sleep(timeMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createAccountMessage.waitUntil(visible, timeMilliseconds);
        return this;
    }

    public CreateAccountPage selectTitle (){
        titleRadioButton.click();
        return this;
    }

    public CreateAccountPage writeFirstName (String firstName){
        firstnameText.click();
        firstnameText.setValue(firstName);
        return this;
    }

    public CreateAccountPage writeLastName (String lastName){
        lastnameText.click();
        lastnameText.setValue(lastName);
        return this;
    }

    public CreateAccountPage writePassword (String password){
        passwordText.waitUntil(visible, timeMilliseconds).scrollTo();
        passwordText.click();
        passwordText.setValue(password);
        return this;
    }

    public CreateAccountPage writeDay (String day){
        daySelect.click();
        daySelect.selectOptionByValue(day);
        return this;
    }

    public CreateAccountPage writeMonth (String month){
        monthSelect.click();
        monthSelect.selectOptionByValue(month);
        return this;
    }

    public CreateAccountPage writeYear (String year){
        yearSelect.click();
        yearSelect.selectOptionByValue(year);
        return this;
    }

    public CreateAccountPage writeFirstNameDir (String firstName){
        firstNameDirText.click();
        firstNameDirText.setValue(firstName);
        return this;
    }

    public CreateAccountPage writeLastNameDir (String lastName){
        lastNameDirText.click();
        lastNameDirText.setValue(lastName);
        return this;
    }

    public CreateAccountPage writeCompany (String company){
        companyText.waitUntil(visible, timeMilliseconds).scrollTo();
        companyText.click();
        companyText.setValue(company);
        return this;
    }

    public CreateAccountPage writeAddress (String address){
        addressText.click();
        addressText.setValue(address);
        return this;
    }

    public CreateAccountPage writeCity (String city){
        cityText.click();
        cityText.setValue(city);
        return this;
    }

    public CreateAccountPage writeState (String state){
        stateSelect.click();
        stateSelect.selectOptionByValue(state);
        return this;
    }

    public CreateAccountPage writePostalCode (String zipCode){
        zipCodeText.waitUntil(visible, timeMilliseconds).scrollTo();
        zipCodeText.click();
        zipCodeText.setValue(zipCode);
        return this;
    }

    public CreateAccountPage writeCountry (String country){
        countrySelect.click();
        countrySelect.selectOptionByValue(country);
        return this;
    }

    public CreateAccountPage writeHomePhone (String homePhone){
        phoneText.click();
        phoneText.setValue(homePhone);
        return this;
    }

    public CreateAccountPage writeMobilePhone (String mobilePhone){
        mobilePhoneText.click();
        mobilePhoneText.setValue(mobilePhone);
        return this;
    }

    public CreateAccountPage writeAddressAlias (String alias){
        addressAliasText.click();
        addressAliasText.setValue(alias);
        return this;
    }

    public CreateAccountPage clickRegisterButton(){
        registerButton.waitUntil(visible, timeMilliseconds).click();
        return this;
    }

}
