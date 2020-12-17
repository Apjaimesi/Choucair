package co.com.choucair.pageObjects;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public HomePage openPage (String url) {
        System.setProperty("selenide browser", "Chrome");
        open(url);
    return this;
    }
}
