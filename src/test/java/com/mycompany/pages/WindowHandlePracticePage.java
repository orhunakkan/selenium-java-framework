package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePracticePage {

    @FindBy(linkText = "Click Here")
    public WebElement clickHereLink;
    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;

    public WindowHandlePracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
