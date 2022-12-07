package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestSetup;

public class CheckoutPageStepDefinitions {
    CheckoutPage checkoutPage;
    TestSetup testSetup;

    public CheckoutPageStepDefinitions(TestSetup testSetup)
    {
        this.testSetup = testSetup;
        this.checkoutPage = testSetup.pageObjectManager.getCheckoutPage();
    }

    @Then("^User validates (.+) in checkout page$")
    public void user_validates_product_in_checkout_page(String productInCheckoutPage) {
        checkoutPage.verifyProductInCheckoutpage(productInCheckoutPage);
    }
    @Then("verify user can apply the promo code")
    public void verify_user_can_apply_the_promo_code() {
        checkoutPage.applyPromoCode();
    }
    @Then("verify user can place the order")
    public void verify_user_can_place_the_order() {
        checkoutPage.placeOrder();
    }
}