package com.mycompany.e2e;

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
    public void hoverOverTest(){
        //TC#1
        //1. Go to http://practice.cydeo.com/hovers
        Driver.getDriver().get("http://practice.cydeo.com/hovers");

        //2. Hover over to first image
        actions.moveToElement(actionsPracticePage.img1).perform();

        //3. Assert: “name: user1” is displayed
        assertTrue(actionsPracticePage.name1.isDisplayed(),"Name 1 did not appear!");

        //4. Hover over to second image
        actions.moveToElement(actionsPracticePage.img2).perform();

        //5. Assert: “name: user2” is displayed
        assertTrue(actionsPracticePage.name2.isDisplayed(),"Name 2 did not appear!");

        //6. Hover over to third image
        actions.moveToElement(actionsPracticePage.img3).perform();

        //7. Assert: “name: user3” is displayed
        assertTrue(actionsPracticePage.name3.isDisplayed(),"Name 3 did not appear!");
    }


    @Test
    public void rightClickTest(){
        //TC#2
        //1. Go to https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //2. Right click on A/B Testing link
        //3. Open link in new window
        actions.contextClick()
                .sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.RETURN)
                .perform();


        //4. Verify title is "No A/B Test"
        assertEquals(Driver.getDriver().getTitle(),"No A/B Test");
    }

    @Test
    public void jsExecutorScrollingTest(){
        //TC#3
        //1. Go	to https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());

        //2. Scroll down to "Cydeo" link
        js.executeScript("arguments[0].scrollIntoView(true)",actionsPracticePage.cydeoLink,actionsPracticePage.homeLink);

        //3. Scroll up to "Home" link
        js.executeScript("arguments[1].scrollIntoView(true)",actionsPracticePage.cydeoLink,actionsPracticePage.homeLink);
    }
}
