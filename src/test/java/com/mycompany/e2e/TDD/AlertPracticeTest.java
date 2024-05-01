package com.mycompany.e2e.TDD;

import com.mycompany.pages.AlertPracticePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertPracticeTest {

    AlertPracticePage alertPracticePage = new AlertPracticePage();

    @Test
    public void jsAlertTest() {
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");
        alertPracticePage.jsAlertBtn.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();
        String actualResultText = alertPracticePage.resultText.getText();
        String expectedResultText = "You entered: hello";
        assertEquals(actualResultText, expectedResultText);
        Driver.closeDriver();
    }

}
