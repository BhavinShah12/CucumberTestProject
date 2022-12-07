package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestSetup;

public class OffersPageStepDefinitions {
    public TestSetup testSetup;
    public String offersPageProductName;

    public OffersPageStepDefinitions(TestSetup testSetup) {
        this.testSetup = testSetup;
    }

    @Then("^user searches (.+) in offers page$")
    public void userSearchesInOffersPage(String searchKeyword) throws InterruptedException {
        switchToOffersPage();
        OffersPage offersPage = testSetup.pageObjectManager.getOffersPage();
        offersPage.searchProductOnOffersPage(searchKeyword);
        Thread.sleep(2000);
        offersPageProductName = offersPage.getProductNameOnOffersPage();
    }

    public void switchToOffersPage() {
        LandingPage landingPage = testSetup.pageObjectManager.getLandingPage();
        testSetup.genericUtils.switchToChildWindow();
    }

    @And("validate product name is offers page matches with landing page product name")
    public void validateProductNameIsOffersPageMatchesWithLandingPageProductName() {
        Assert.assertEquals(offersPageProductName, testSetup.landingPageProductName);
    }
}