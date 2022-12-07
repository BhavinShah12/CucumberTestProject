package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {
    public WebDriver driver;

    public GenericUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToChildWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> objIterator = windowHandles.iterator();
        String parentWindow = objIterator.next();
        String childWindow = objIterator.next();
        driver.switchTo().window(childWindow);
    }
}