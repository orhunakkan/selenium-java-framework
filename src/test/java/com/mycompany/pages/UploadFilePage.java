package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {

    public UploadFilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="file-upload")
    public WebElement chooseFileBtn;

    @FindBy(id="file-submit")
    public WebElement uploadBtn;

    @FindBy(xpath = "//h3[.='File Uploaded!']")
    public WebElement headerText;

}
