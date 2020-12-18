package co.com.choucair.steps.homePage;

import co.com.choucair.pageObjects.HomePage.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageSteps {
   HomePage homePage;

   public HomePageSteps(HomePage homePage){
     this.homePage = homePage;
    }

    @Given("^the user open the test page \"([^\"]*)\"$")
    public void openPage(String url) {
        homePage.openPage(url);
    }

    @And("^It should show to the user some results$")
    public void validateModal (){
       homePage.validateLogoModal();
   }

}
