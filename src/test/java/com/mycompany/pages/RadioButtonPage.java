package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    @FindBy(id = "blue")
    public WebElement blueButton;
    @FindBy(id = "football")
    public WebElement footballButton;
    @FindBy(id = "red")
    public WebElement redButton;
    @FindBy(id = "green")
    public WebElement greenButton;

    public RadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
