package com.mycompany.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

    }

    private static final InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            String browserName = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browserName) {
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driverPool.get().manage().window().maximize();
                    break;
                case "edge":
                    driverPool.set(new EdgeDriver());
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driverPool.get().manage().window().maximize();
                    break;
                case "chrome":
                default:
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driverPool.get().manage().window().maximize();
                    break;
            }
        }
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
