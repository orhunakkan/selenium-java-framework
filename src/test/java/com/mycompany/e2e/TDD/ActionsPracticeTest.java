package com.mycompany.e2e.TDD;

import com.mycompany.pages.ActionsPracticePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActionsPracticeTest {

    ActionsPracticePage actionsPracticePage = new ActionsPracticePage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void hoverOverTest() {
        Driver.getDriver().get("http://practice.cydeo.com/hovers");
        actions.moveToElement(actionsPracticePage.img1).perform();
        assertTrue(actionsPracticePage.name1.isDisplayed(), "Name 1 did not appear!");
        actions.moveToElement(actionsPracticePage.img2).perform();
        assertTrue(actionsPracticePage.name2.isDisplayed(), "Name 2 did not appear!");
        actions.moveToElement(actionsPracticePage.img3).perform();
        assertTrue(actionsPracticePage.name3.isDisplayed(), "Name 3 did not appear!");
        Driver.closeDriver();
    }


    @Test
    public void rightClickTest() {
        Driver.getDriver().get("https://practice.cydeo.com/");
        actions.contextClick(actionsPracticePage.abTestLink)
                .sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN)
                .perform();
        assertEquals(Driver.getDriver().getTitle(), "No A/B Test");
        Driver.closeDriver();
    }

    @Test
    public void jsExecutorScrollingTest() {
        Driver.getDriver().get("https://practice.cydeo.com/");
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView(true)", actionsPracticePage.cydeoLink, actionsPracticePage.homeLink);
        js.executeScript("arguments[1].scrollIntoView(true)", actionsPracticePage.cydeoLink, actionsPracticePage.homeLink);
        Driver.closeDriver();
    }
}
