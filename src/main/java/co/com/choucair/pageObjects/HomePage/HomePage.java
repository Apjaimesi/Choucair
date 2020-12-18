package co.com.choucair.pageObjects.HomePage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private SelenideElement logoImage =$(byTitle("My Store"));
    public int timeMilliseconds = 3000;

    public HomePage openPage (String url) {
        System.setProperty("selenide browser", "Chrome");
        open(url);
    return this;
    }

    public HomePage validateLogoModal(){
        try{
            Thread.sleep(timeMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logoImage.waitUntil(visible, timeMilliseconds);
        return this;
    }


}
