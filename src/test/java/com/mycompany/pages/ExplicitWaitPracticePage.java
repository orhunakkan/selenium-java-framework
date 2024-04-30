package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPracticePage {

    //TC#1
    //1. Go to http://practice.cydeo.com/dynamic_loading/1
    //2. Click to start
    //3. Wait until loading bar disappears
    //4. Assert username inputbox is displayed
    //5. Enter username: tomsmith
    //6. Enter password: incorrectpassword
    //7. Click to Submit button
    //8. Assert “Your password is invalid!” text is displayed.

    //TC#2
    //1. Go to http://practice.cydeo.com/dynamic_loading/7
    //2. Wait until title is “Dynamic title”
    //3. Assert : Message “Done” is displayed.
    //4. Assert : Image is displayed.

    public ExplicitWaitPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy(id="username")
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

}
