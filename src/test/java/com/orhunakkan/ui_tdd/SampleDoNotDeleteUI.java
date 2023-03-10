package com.orhunakkan.ui_tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.orhunakkan.utilities.Driver;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.bonigarcia.seljup.SeleniumJupiter;

@ExtendWith(SeleniumJupiter.class)
public class SampleDoNotDeleteUI {

    @Test
    public void validateStandardUsername() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        WebElement userNames = Driver.getDriver().findElement(By.cssSelector("#login_credentials"));
        String allUserNames = userNames.getText();
        assertTrue(allUserNames.contains("standard_user"));
        Driver.closeDriver();
        // Code Code Code
    }
}
