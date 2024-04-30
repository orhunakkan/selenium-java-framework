package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    @FindBy(id = "box1")
    public WebElement checkBox1;
    @FindBy(id = "box2")
    public WebElement checkBox2;

    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
