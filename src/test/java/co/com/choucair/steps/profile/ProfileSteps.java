package co.com.choucair.steps.profile;

import co.com.choucair.pageObjects.HomePage.HomePage;
import co.com.choucair.pageObjects.profile.ProfilePage;
import co.com.choucair.pageObjects.profile.CreateAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileSteps {

    HomePage homePage;
    ProfilePage profilePage;
    CreateAccountPage createAccountPage;

    public ProfileSteps(HomePage homePage, ProfilePage profilePage, CreateAccountPage createAccountPage){
        this.homePage = homePage;
        this.profilePage = profilePage;
        this.createAccountPage = createAccountPage;
    }

    @And("^the user should click the button Sign in$")
    public void clickSignIn() {
        profilePage.clickSigInButton();
    }

    @Given("^the user is in the Authentication page$")
    public void validateProfilePage() {
        profilePage.validateAuthenticationMessage();
    }

    @And("^the user writes a valid email$")
    public void writeEmail(){
        profilePage.writeEmailText(profilePage.emailAddress);
    }

    @When("^the user press click the button Create an account$")
    public void clickCreateAccount() {
        profilePage.clickCreateAccountButton();
    }

    @Then("^the user should add your personal information$")
    public void createAccount() {
        createAccountPage.validateCreateAccountMessage();
        createAccountPage.selectTitle();
        createAccountPage.writeFirstName(createAccountPage.firstName);
        createAccountPage.writeLastName(createAccountPage.lastName);
        createAccountPage.writePassword(createAccountPage.password);
        createAccountPage.writeDay(createAccountPage.day);
        createAccountPage.writeMonth(createAccountPage.month);
        createAccountPage.writeYear(createAccountPage.year);
        createAccountPage.writeFirstNameDir(createAccountPage.firstName);
        createAccountPage.writeLastNameDir(createAccountPage.lastName);
        createAccountPage.writeCompany(createAccountPage.company);
        createAccountPage.writeAddress(createAccountPage.address);
        createAccountPage.writeCity(createAccountPage.city);
        createAccountPage.writeState(createAccountPage.state);
        createAccountPage.writePostalCode(createAccountPage.zip);
        createAccountPage.writeCountry(createAccountPage.country);
        createAccountPage.writeHomePhone(createAccountPage.homePhone);
        createAccountPage.writeMobilePhone(createAccountPage.mobilePhone);
        createAccountPage.writeAddressAlias(createAccountPage.alias);
    }

    @Then("^the user should click the button Register$")
    public void clickRegister() {
        createAccountPage.clickRegisterButton();
    }

    @When("^the user writes a valid email \"([^\"]*)\" and a valid password \"([^\"]*)\"$")
    public void writeLoginFields(String user, String password) {
        profilePage.writeUser(user);
        profilePage.writePassword(password);
    }

    @Then("^the user should click the button Sign in to Login into the account$")
    public void clickSigIn() {
        profilePage.clickLogInButton();
    }
}
