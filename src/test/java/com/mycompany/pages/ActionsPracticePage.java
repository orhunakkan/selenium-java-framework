package com.mycompany.pages;

import com.mycompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPracticePage {

    //TC#1
    //1. Go to http://practice.cydeo.com/hovers
    //2. Hover over to first image
    //3. Assert: “name: user1” is displayed
    //4. Hover over to second image
    //5. Assert: “name: user2” is displayed
    //6. Hover over to third image
    //7. Assert: “name: user3” is displayed


    //TC#2
    //1. Go	to https://practice.cydeo.com/
    //2. Right click on A/B Testing link
    //3. Open link in new window
    //4. Verify title is "No A/B Test"

    //TC#3
    //1. Go	to https://practice.cydeo.com/
    //2. Scroll down to "Cydeo" link
    //3. Scroll up to "Home" link

    public ActionsPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//img)[1]")
    public WebElement img1;

    @FindBy(xpath="(//img)[2]")
    public WebElement img2;

    @FindBy(xpath="(//img)[3]")
    public WebElement img3;

    @FindBy(xpath="//h5[.='name: user1']")
    public WebElement name1;

    @FindBy(xpath="//h5[.='name: user2']")
    public WebElement name2;

    @FindBy(xpath="//h5[.='name: user3']")
    public WebElement name3;

    @FindBy(linkText = "A/B Testing")
    public WebElement abTestLink;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;

    @FindBy(linkText = "Home")
    public WebElement homeLink;

}
