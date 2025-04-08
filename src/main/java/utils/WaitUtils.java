package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        }
        return wait;
    }

    public static WebElement waitForElementToBeVisible(By element) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitForTitle(String title) {
        getWait().until(ExpectedConditions.titleIs(title));
    }

}
