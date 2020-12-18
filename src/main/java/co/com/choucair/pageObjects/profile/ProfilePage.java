package co.com.choucair.pageObjects.profile;

import co.com.choucair.pageObjects.HomePage.HomePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;

public class ProfilePage {

    public int timeMilliseconds = 3000;
    private SelenideElement authMessage =$(byText("Authentication"));
    private SelenideElement login = $(byTitle("Log in to your customer account"));
    private SelenideElement email = $(byId("email_create"));
    private SelenideElement createAccountButton = $(byId("SubmitCreate"));
    private SelenideElement emailText = $(byId("email"));
    private SelenideElement passwordText = $(byId("passwd"));
    private SelenideElement loginUser = $(byId("SubmitLogin"));

    public String emailAddress = "test10178@mail.com"; //Generar Email aleatorio

    public HomePage clickSigInButton() {
        login.waitUntil(visible, timeMilliseconds).click();
        return page(HomePage.class);
    }

    public ProfilePage validateAuthenticationMessage(){
        try{
            Thread.sleep(timeMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        authMessage.waitUntil(visible, timeMilliseconds);
        return this;
    }

    public ProfilePage writeEmailText(String emailAddress){
        email.waitUntil(visible, timeMilliseconds).scrollTo();
        email.click();
        email.setValue(emailAddress);
        return this;
    }

    public ProfilePage clickCreateAccountButton(){
        createAccountButton.waitUntil(visible, timeMilliseconds).click();
        return this;
    }

    public ProfilePage writeUser(String user){
        emailText.click();
        emailText.setValue(user);
        return this;
    }

    public ProfilePage writePassword(String password){
        passwordText.click();
        passwordText.setValue(password);
        return this;
    }

    public ProfilePage clickLogInButton(){
        loginUser.waitUntil(visible, timeMilliseconds).click();
        return this;
    }
}
