package com.mycompany.e2e;

import com.mycompany.pages.ExplicitWaitPracticePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExplicitWaitTest {

    ExplicitWaitPracticePage explicitWaitPracticePage = new ExplicitWaitPracticePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @Test
    public void dynamicLoad1(){
        //TC#1
        //1. Go to http://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        explicitWaitPracticePage.startBtn.click();

        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.visibilityOf(explicitWaitPracticePage.userName));

        //4. Assert username inputbox is displayed
        assertTrue(explicitWaitPracticePage.userName.isDisplayed());

        //5. Enter username: tomsmith
        explicitWaitPracticePage.userName.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        explicitWaitPracticePage.password.sendKeys("incorrectpassword");

        //7. Click to Submit button
        explicitWaitPracticePage.submitBtn.click();

        //8. Assert “Your password is invalid!” text is displayed.
        assertTrue(explicitWaitPracticePage.resultText.isDisplayed());
    }

    @Test
    public void dynamicLoad7(){
        //TC#2
        //1. Go to http://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3. Assert : Message “Done” is displayed.
        assertTrue(explicitWaitPracticePage.doneMsg.isDisplayed());

        //4. Assert : Image is displayed.
        assertTrue(explicitWaitPracticePage.image.isDisplayed());

    }

}
