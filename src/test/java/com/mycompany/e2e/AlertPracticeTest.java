package com.mycompany.e2e;

import com.mycompany.pages.AlertPracticePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertPracticeTest {

    AlertPracticePage alertPracticePage = new AlertPracticePage();

    @Test
    public void jsAlertTest(){
        //1. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        //2. Click for JS Prompt button for alert to be displayed
        alertPracticePage.jsAlertBtn.click();

        Alert alert = Driver.getDriver().switchTo().alert();

        //3. Write "hello" in input text
        alert.sendKeys("hello");

        //3. Click OK button from the alert
        alert.accept();

        //4. Verify "You entered: hello" text is displayed in result
        String actualResultText = alertPracticePage.resultText.getText();
        String expectedResultText = "You entered: hello";
        assertEquals(actualResultText,expectedResultText);

        Driver.closeDriver();
    }

}
