package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaFakerPage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;
    @FindBy(linkText = "Order")
    public WebElement OrderBtn;
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropdown;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;
    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement CalculateBtn;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaBtn;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNo;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expDate;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;
    @FindBy(xpath = "//strong[normalize-space(text())='New order has been successfully added.']")
    public WebElement resultText;

    public JavaFakerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
