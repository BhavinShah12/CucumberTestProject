package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;
import java.io.IOException;


public class TestSetup {
    public WebDriver driver;
    public TestBase testBase;
    public GenericUtils genericUtils;
    public String landingPageProductName;
    public PageObjectManager pageObjectManager;

    public TestSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
        genericUtils = new GenericUtils(testBase.WebDriverManager());
    }
}