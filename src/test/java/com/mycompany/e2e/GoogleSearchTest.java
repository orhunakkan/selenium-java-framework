package com.mycompany.e2e;

import com.mycompany.pages.GoogleSearchPage;
import com.mycompany.utilities.ConfigurationReader;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchTest {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Test
    public void googleSearchTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        assertEquals(Driver.getDriver().getTitle(),"apple - Google Search");
    }

    @Test
    public void hardAssertionTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        assertEquals(Driver.getDriver().getTitle(),"app - Google Search");

        System.out.println("This is coming from after hard assertion fails!");

    }

    @Test
    public void softAssertionTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        assertEquals(Driver.getDriver().getTitle(),"app - Google Search");

        System.out.println("This is coming from after soft assertion fails!");

        assertAll();

    }

}
