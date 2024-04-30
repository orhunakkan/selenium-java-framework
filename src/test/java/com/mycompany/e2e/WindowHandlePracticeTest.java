package com.mycompany.e2e;

import com.mycompany.pages.WindowHandlePracticePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowHandlePracticeTest {

    WindowHandlePracticePage windowHandlePracticePage = new WindowHandlePracticePage();

    @Test
    public void windowHandleTest() {
        Driver.getDriver().get("https://practice.cydeo.com/windows");
        String currentWindow = Driver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        assertEquals(Driver.getDriver().getTitle(), "Windows");
        windowHandlePracticePage.cydeoLink.click();
        Set<String> allWindowsHandle = Driver.getDriver().getWindowHandles();
        for (String eachWindow : allWindowsHandle) {
            Driver.getDriver().switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
            if (Driver.getDriver().getTitle().equals("Cydeo")) {
                break;
            }
        }
        assertEquals(Driver.getDriver().getTitle(), "Cydeo");
        Driver.getDriver().switchTo().window(currentWindow);
        assertEquals(Driver.getDriver().getTitle(), "Windows");
        Driver.closeDriver();
    }

}
