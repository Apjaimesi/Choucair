package co.com.choucair;

import co.com.choucair.pageObjects.HomePage;
import cucumber.api.java.en.Given;

public class HomePageSteps {
   HomePage homePage;

   public HomePageSteps(HomePage homePage){
     this.homePage = homePage;
    }

   private String url = "http://automationpractice.com/index.php";

    @Given("the user enter to the page")
    public void the_user_enter_to_the_page() {
        homePage.openPage(url);
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    /*
    @Given("the user enter to the page {string}")
    public void the_user_enter_to_the_page(String url) {
        System.setProperty("selenide.browser", "Chrome");
        homePage.openPage(url);
        throw new io.cucumber.java.PendingException();
    }*/
}
