package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.SuccessCheckoutPage;
import utils.WaitUtils;

public class SuccessCheckoutSteps {

    private SuccessCheckoutPage successCheckoutPage;
    private WebDriver driver = Hooks.driver;

    public SuccessCheckoutSteps() {
        this.successCheckoutPage = new SuccessCheckoutPage(driver);
    }

    @When("user click add to cart any product")
    public void userClickAddToCartAnyProduct() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addProductElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getAddProduct());

        Assert.assertTrue("add product should be clickable", addProductElement.isEnabled());
        addProductElement.click();

        WebElement removeProductElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getRemoveProduct());
        String actualButtonState = removeProductElement.getText();
        String expectedButtonState = "Remove";

        Assert.assertEquals(expectedButtonState, actualButtonState);
    }

    @And("user click cart icon")
    public void userClickCartIcon() throws InterruptedException {
        Thread.sleep(3000);
        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getCounterProduct());

        WebElement cartButtonElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getCartButton());

        Assert.assertTrue("cart button should be clickable", cartButtonElement.isEnabled());
        cartButtonElement.click();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() throws InterruptedException {
        Thread.sleep(3000);
        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getCartList());

        WebElement checkoutButtonElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getCheckoutButton());

        Assert.assertTrue("checkout button should be clickable", checkoutButtonElement.isEnabled());
        checkoutButtonElement.click();
    }

    @And("user input first name")
    public void userInputFirstName() throws InterruptedException {
        Thread.sleep(3000);
        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getInputForm());

        WebElement firstNameElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getFirstName());

        firstNameElement.sendKeys("Muhammad");

        String actualFirstNameInput = firstNameElement.getAttribute("value");

        Assert.assertEquals("Muhammad", actualFirstNameInput);
    }

    @And("user input last name")
    public void userInputLastName() throws InterruptedException {
        Thread.sleep(3000);
        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getInputForm());

        WebElement lastNameElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getLastName());

        lastNameElement.sendKeys("Ikbal");

        String actualLastNameInput = lastNameElement.getAttribute("value");

        Assert.assertEquals("Ikbal", actualLastNameInput);
    }

    @And("user input postal code")
    public void userInputPostalCode() throws InterruptedException {
        Thread.sleep(3000);
        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getInputForm());

        WebElement postalCodeElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getPostalCode());

        postalCodeElement.sendKeys("16518");

        String actualpostalCodeInput = postalCodeElement.getAttribute("value");

        Assert.assertEquals("16518", actualpostalCodeInput);
    }

    @And("user click continue button")
    public void userClickContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getInputForm());

        WebElement continueButtonElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getContinueButton());

        Assert.assertTrue("continue button should be clickable", continueButtonElement.isEnabled());
        continueButtonElement.click();
    }

    @And("user click finish")
    public void userClickFinish() throws InterruptedException {
        Thread.sleep(3000);
        WebElement paymentInformationElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getPaymentInformation());
        WebElement shippingInformationElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getShippingInformation());
        WebElement priceTotalElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getPriceTotal());

        String actualPaymentInformationState = paymentInformationElement.getText();
        String actualShippingInformationState = shippingInformationElement.getText();
        String actualPriceTotalState = priceTotalElement.getText();

        Assert.assertEquals("Payment Information:", actualPaymentInformationState);
        Assert.assertEquals("Shipping Information:", actualShippingInformationState);
        Assert.assertEquals("Price Total", actualPriceTotalState);

        WebElement finishButtonElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getFinishButton());
        Assert.assertTrue("finish button should be clickable", finishButtonElement.isEnabled());
        finishButtonElement.click();
    }

    @Then("user see success information")
    public void userSeeSuccessInformation() throws InterruptedException {
        Thread.sleep(3000);
        WebElement successStateElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getSuccessState());
        String actualSuccessState = successStateElement.getText();
        String expectedSuccessState = "Thank you for your order!";

        Assert.assertEquals(expectedSuccessState, actualSuccessState);
    }

}
