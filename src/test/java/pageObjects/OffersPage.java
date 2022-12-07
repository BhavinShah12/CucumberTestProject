package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    WebDriver driver;

    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }

    By offersPageSearch = By.xpath("//input[@type='search']");
    By offersPageProductName = By.cssSelector("tr td:nth-child(1)");

    public void searchProductOnOffersPage(String searchKeyword) {
        driver.findElement(offersPageSearch).sendKeys(searchKeyword);
    }

    public String getProductNameOnOffersPage() {
        return driver.findElement(offersPageProductName).getText();
    }
}