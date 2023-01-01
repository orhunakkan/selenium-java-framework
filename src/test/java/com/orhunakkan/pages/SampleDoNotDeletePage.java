package com.orhunakkan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orhunakkan.utilities.Driver;

public class SampleDoNotDeletePage {

    public SampleDoNotDeletePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#login_credentials")
    public WebElement standardUserName;

}
