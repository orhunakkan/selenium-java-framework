package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPracticePage {

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;
    @FindBy(id = "username")
    public WebElement userName;
    @FindBy(id = "pwd")
    public WebElement password;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn;
    @FindBy(id = "flash")
    public WebElement resultText;
    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMsg;
    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement image;

    public ExplicitWaitPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
