package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.TestSetup;

import java.io.File;
import java.io.IOException;


public class Hooks {
   TestSetup testSetup;

    public Hooks(TestSetup testSetup) {
        this.testSetup = testSetup;
    }

    @After
    public void afterScenario() throws IOException {
        testSetup.testBase.WebDriverManager().quit();
    }
}