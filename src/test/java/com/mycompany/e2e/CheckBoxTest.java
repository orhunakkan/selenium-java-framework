package com.mycompany.e2e;

import com.mycompany.pages.CheckBoxPage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckBoxTest {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test
    public void checkBoxButtonTest() {
        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");
        assertFalse(checkBoxPage.checkBox1.isSelected());
        assertTrue(checkBoxPage.checkBox2.isSelected());
        checkBoxPage.checkBox1.click();
        checkBoxPage.checkBox2.click();
        assertTrue(checkBoxPage.checkBox1.isSelected());
        assertFalse(checkBoxPage.checkBox2.isSelected());
        Driver.closeDriver();
    }

}
