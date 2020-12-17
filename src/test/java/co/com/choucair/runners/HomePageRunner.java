package co.com.choucair.runners;

import cucumber.api.CucumberOptions;
//import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources"})


public class HomePageRunner {
}
