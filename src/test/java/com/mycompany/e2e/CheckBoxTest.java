package com.mycompany.e2e;

import com.mycompany.pages.CheckBoxPage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckBoxTest {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test
    public void checkBoxButtonTest(){

        //TC #1:checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        assertFalse(checkBoxPage.checkBox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        assertTrue(checkBoxPage.checkBox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkBoxPage.checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        checkBoxPage.checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        assertTrue(checkBoxPage.checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        assertFalse(checkBoxPage.checkBox2.isSelected());

        Driver.closeDriver();
    }

}
