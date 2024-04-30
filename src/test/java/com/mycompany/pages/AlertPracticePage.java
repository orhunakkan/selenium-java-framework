package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPracticePage {

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement jsAlertBtn;
    @FindBy(id = "result")
    public WebElement resultText;

    public AlertPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
