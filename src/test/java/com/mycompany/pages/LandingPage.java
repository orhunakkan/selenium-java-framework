package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    @FindBy(tagName = "h5")
    private WebElement header;

    public LandingPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
}
