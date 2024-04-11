package com.mycompany.e2e.TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.mycompany.utilities.Driver;

public class SampleTest {

    @Test
    public void myFirstSampleTest() {
        Driver.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/");
        String pageTitle = Driver.getDriver().getTitle();
        Assertions.assertEquals("Hands-On Selenium WebDriver with Java", pageTitle);
        Driver.closeDriver();
    }
}
