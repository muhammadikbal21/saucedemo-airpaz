package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessCheckoutPage {

    private WebDriver driver;

    public SuccessCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By addProduct = By.id("add-to-cart-sauce-labs-backpack");
    By removeProduct = By.id("remove-sauce-labs-backpack");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By counterProduct = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By cartList = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]");
    By checkoutButton = By.id("checkout");
    By inputForm = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By paymentInformation = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]");
    By shippingInformation = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[3]");
    By priceTotal = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]");
    By finishButton = By.id("finish");
    By successState = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public By getAddProduct() {
        return addProduct;
    }

    public By getRemoveProduct() {
        return removeProduct;
    }

    public By getCartButton() {
        return cartButton;
    }

    public By getCounterProduct() {
        return counterProduct;
    }

    public By getCartList() {
        return cartList;
    }

    public By getCheckoutButton() {
        return checkoutButton;
    }

    public By getInputForm() {
        return inputForm;
    }

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getPostalCode() {
        return postalCode;
    }

    public By getContinueButton() {
        return continueButton;
    }

    public By getPaymentInformation() {
        return paymentInformation;
    }

    public By getShippingInformation() {
        return shippingInformation;
    }

    public By getPriceTotal() {
        return priceTotal;
    }

    public By getFinishButton() {
        return finishButton;
    }

    public By getSuccessState() {
        return successState;
    }
}
