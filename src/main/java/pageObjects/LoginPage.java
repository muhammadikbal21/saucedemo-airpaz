package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginTitle = By.xpath("//*[@id=\"root\"]/div/div[1]");
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public By getLoginTitle() {
        return loginTitle;
    }

    public By getUsernameField() {
        return usernameField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getLoginButton() {
        return loginButton;
    }
}
