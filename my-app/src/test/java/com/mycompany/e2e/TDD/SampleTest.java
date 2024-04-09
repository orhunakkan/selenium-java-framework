package com.mycompany.e2e.TDD;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    @Test
    public void myFirstSampleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String pageTitle = driver.getTitle();
        if ("Hands-On Selenium WebDriver with Java".equals(pageTitle)) {
            System.out.println("Title is validated successfully.");
        } else {
            System.out.println("Title validation failed. Found: " + pageTitle);
        }
        driver.quit();
    }
}
