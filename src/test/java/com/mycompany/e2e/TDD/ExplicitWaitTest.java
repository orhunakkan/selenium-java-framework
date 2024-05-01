package com.mycompany.e2e.TDD;

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
    public void dynamicLoad1() {
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/1");
        explicitWaitPracticePage.startBtn.click();
        wait.until(ExpectedConditions.visibilityOf(explicitWaitPracticePage.userName));
        assertTrue(explicitWaitPracticePage.userName.isDisplayed());
        explicitWaitPracticePage.userName.sendKeys("tomsmith");
        explicitWaitPracticePage.password.sendKeys("incorrectpassword");
        explicitWaitPracticePage.submitBtn.click();
        assertTrue(explicitWaitPracticePage.resultText.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void dynamicLoad7() {
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/7");
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        assertTrue(explicitWaitPracticePage.doneMsg.isDisplayed());
        assertTrue(explicitWaitPracticePage.image.isDisplayed());
        Driver.closeDriver();
    }
}
