package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
    By productNameInCheckoutpage = By.cssSelector("p.product-name");
    By applyButton = By.xpath("//button[contains(text(),'Apply')]");
    By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyPromoCode() {
        driver.findElement(applyButton).isDisplayed();
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public void verifyProductInCheckoutpage(String productInCheckoutPage) {
        String productToPurchase = driver.findElement(productNameInCheckoutpage).getText().split("-")[0].trim();
    }
}