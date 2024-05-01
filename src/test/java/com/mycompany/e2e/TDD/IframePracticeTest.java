package com.mycompany.e2e.TDD;

import com.mycompany.pages.IframePracticePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IframePracticeTest {

    IframePracticePage iframePracticePage = new IframePracticePage();

    @Test
    public void iframeTest() {
        Driver.getDriver().get("https://practice.cydeo.com/iframe");
        Driver.getDriver().switchTo().frame(0);
        String actualText = iframePracticePage.contentTextArea.getText();
        String expectedText = "Your content goes here.";
        assertEquals(actualText, expectedText);
        Driver.getDriver().switchTo().defaultContent();
        String actualHeader = iframePracticePage.headerText.getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";
        assertEquals(actualHeader, expectedHeader);
        Driver.closeDriver();
    }
}
