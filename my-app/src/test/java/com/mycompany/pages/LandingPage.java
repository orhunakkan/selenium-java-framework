package com.mycompany.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.utilities.Driver;

public class LandingPage {

    WebDriver driver;

    public LandingPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h5")
    private WebElement header;

}
