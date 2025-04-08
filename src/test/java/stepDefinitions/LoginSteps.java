package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPage;
import utils.WaitUtils;

public class LoginSteps {

    private LoginPage loginPage;
    private WebDriver driver = Hooks.driver;

    public LoginSteps() {
        this.loginPage = new LoginPage(driver);
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        WebElement titlePageElement = WaitUtils.waitForElementToBeVisible(loginPage.getLoginTitle());

        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        String expectedTitlePage = "Swag Labs";
        Assert.assertEquals(titlePageElement.getText(), expectedTitlePage);
    }

    @When("input username {string}")
    public void inputUsername(String username) {
        WebElement usernameElement = WaitUtils.waitForElementToBeVisible(loginPage.getUsernameField());

        usernameElement.sendKeys(username);

        // ini berfungsi untuk mengambil nilai dari field username agar dapat diperiksa
        String expectedUsernameInput = usernameElement.getAttribute("value");
        Assert.assertEquals("Username input mismatch", expectedUsernameInput, username);
    }

    @And("input password {string}")
    public void inputPassword(String password) {
        WebElement passwordElement = WaitUtils.waitForElementToBeVisible(loginPage.getPasswordField());

        passwordElement.sendKeys(password);

        // ini mengecek apakah field password bertipe "password" (untuk memastikan teks disembunyikan)
        boolean isPasswordType = "password".equals(passwordElement.getAttribute("type"));
        // Asersi untuk memastikan password terisi
        Assert.assertTrue("Password input mismatch", isPasswordType);
    }

    @And("click login button")
    public void clickLoginButton() {
        WebElement loginButtonElement = WaitUtils.waitForElementToBeVisible(loginPage.getLoginButton());

        loginButtonElement.click();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        WaitUtils.waitForTitle("Swag Labs");

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
