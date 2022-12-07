package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;
import utils.TestSetup;

public class LandingPageStepDefinitions {
    LandingPage landingPage;
    TestSetup testSetup;

    public LandingPageStepDefinitions(TestSetup testSetup)
    {
        this.testSetup = testSetup;
        this.landingPage = testSetup.pageObjectManager.getLandingPage();
    }
    @Given("User is on Green-Kart landing page")
    public void userIsOnGreenKartLandingPage() {
        Assert.assertTrue(landingPage.getTitleOfLandingPage().contains("GreenKart"));
    }

    @When("^User enters (.+) to search product and extracts the product name$")
    public void userEntersToSearchProductAndExtractsTheProductName(String searchKeyword) throws InterruptedException {
        landingPage.searchProduct(searchKeyword);
        Thread.sleep(2000);
        testSetup.landingPageProductName = landingPage.getProductName();
    }

    @Then("User clicks on top Deals element")
    public void userClicksOnTopDealsElement() {
        landingPage.clickOnElement();
    }

    @And("User adds {string} items to the cart")
    public void userAddsItemsToTheCart(String expectedQuantity) throws InterruptedException {
        landingPage.addItemsToCart(Integer.parseInt(expectedQuantity));
    }

    @And("User proceeds to checkout")
    public void userProceedsToCheckout() throws InterruptedException {
        landingPage.checkoutItems();
    }
}