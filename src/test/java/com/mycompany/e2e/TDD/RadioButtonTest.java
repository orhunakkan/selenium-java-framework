package com.mycompany.e2e.TDD;

import com.mycompany.pages.RadioButtonPage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RadioButtonTest {

    RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test
    public void radioButtonTest() {
        Driver.getDriver().get("http://practice.cydeo.com/radio_buttons");
        assertTrue(radioButtonPage.blueButton.isSelected());
        assertFalse(radioButtonPage.footballButton.isSelected());
        radioButtonPage.footballButton.click();
        assertTrue(radioButtonPage.footballButton.isSelected());
        radioButtonPage.redButton.click();
        assertTrue(radioButtonPage.redButton.isSelected());
        assertFalse(radioButtonPage.blueButton.isSelected());
        assertFalse(radioButtonPage.greenButton.isEnabled(), "Green button is enable!");
        Driver.closeDriver();
    }
}
