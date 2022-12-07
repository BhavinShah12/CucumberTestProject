package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By search = By.xpath("//input[@type='search']");
    By landingPageProductName = By.cssSelector("h4.product-name");
    By topDealsLink = By.xpath("//a[text()='Top Deals']");
    By addToCartButton = By.xpath("//button[contains(text(),'ADD TO CART')]");
    By quantityValue = By.cssSelector("input.quantity");
    By incrementButton = By.xpath("//a[contains(text(),'+')]");
    By decrementButton = By.xpath("//a[contains(text(),'-')]");
    By cartBag = By.cssSelector(("[alt='Cart']"));
    By proceedToCheckoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    public String getTitleOfLandingPage() {
        return driver.getTitle();
    }
    public void searchProduct(String searchKeyword) {
        driver.findElement(search).sendKeys(searchKeyword);
    }

    public String getProductName() {
        return driver.findElement(landingPageProductName).getText().split("-")[0].trim();
    }

    public void clickOnElement() {
        driver.findElement(topDealsLink).click();
    }

    public void addItemsToCart(int expectedQuantity) throws InterruptedException {
       String actualQuantity = driver.findElement(quantityValue).getText();
       int i = expectedQuantity-1;
       while(i>0)
       {
           driver.findElement(incrementButton).click();
           i--;
       }
       driver.findElement(addToCartButton).click();
       Thread.sleep(3000);
    }

    public void checkoutItems() throws InterruptedException {
        driver.findElement(cartBag).click();
        Thread.sleep(3000);
        driver.findElement(proceedToCheckoutButton).click();
    }
}
