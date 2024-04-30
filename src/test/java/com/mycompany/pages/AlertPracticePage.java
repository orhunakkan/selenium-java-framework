package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPracticePage {

    //1. Go to website: http://practice.cydeo.com/javascript_alerts
    //2. Click for JS Prompt button for alert to be displayed
    //3. Write "hello" in input text
    //3. Click OK button from the alert
    //4. Verify "You entered: hello" text is displayed in result

    public AlertPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement jsAlertBtn;

    @FindBy(id="result")
    public WebElement resultText;

}
