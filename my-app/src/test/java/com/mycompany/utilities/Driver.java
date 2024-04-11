package com.mycompany.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserName = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browserName) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                default:
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void waitForElementToBeVisible(WebDriver driver, By locator, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(WebDriver driver, By locator, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
