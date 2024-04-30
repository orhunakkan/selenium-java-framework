package com.mycompany.e2e;

import com.mycompany.pages.DropDownPage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DropDownTest {

    DropDownPage dropDownPage = new DropDownPage();

    @BeforeEach
    public void setUp(){
        //TC#1
        //1. Go to http://practice.cydeo.com/dropdown
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");
    }

    @Test
    public void stateDropdownTest(){
        Select stateSelect = new Select(dropDownPage.stateDropdown);

        //2. Select Illinois --> select by visible text
        stateSelect.selectByVisibleText("Illinois");
        String actualOption = stateSelect.getFirstSelectedOption().getText();
        String expectedOption = "Illinois";
        assertEquals(actualOption,expectedOption);

        //3. Select Virginia --> select by value
        stateSelect.selectByValue("VA");
        actualOption = stateSelect.getFirstSelectedOption().getText();
        expectedOption = "Virginia";
        assertEquals(actualOption,expectedOption);

        //4. Select California --> select by index
        //5. Verify final selected option is California.
        stateSelect.selectByIndex(5);
        actualOption = stateSelect.getFirstSelectedOption().getText();
        expectedOption = "California";
        assertEquals(actualOption,expectedOption);

    }

    @Test
    public void dateOfBirthDropdownTest(){
        //TC#2
        //Select “December 1st, 1950g” and verify it is selected.

        //2. Select Year --> by visible text
        Select yearSelect = new Select(dropDownPage.yearDropdown);
        yearSelect.selectByVisibleText("1950");
        String actualYearOption = yearSelect.getFirstSelectedOption().getText();
        String expectedYearOption = "1950";
        assertEquals(actualYearOption,expectedYearOption,"Year selection did not pass!");

        //3. Select Month -->  by value
        Select monthSelect = new Select(dropDownPage.monthDropdown);
        monthSelect.selectByValue("11");
        String actualMonthOption = monthSelect.getFirstSelectedOption().getText();
        String expectedMonthOption = "December";
        assertEquals(actualMonthOption,expectedMonthOption,"Month selection did not pass!");

        //4. Select Day -->  by index
        Select daySelect = new Select(dropDownPage.dayDropdown);
        daySelect.selectByIndex(0);
        String actualDayOption = daySelect.getFirstSelectedOption().getText();
        String expectedDayOption = "1";
        assertEquals(actualDayOption,expectedDayOption,"Day selection did not pass!");

    }

    @Test
    public void languagesDropdownTest(){

        Select languagesSelect = new Select(dropDownPage.languagesDropdown);
        List<WebElement> languagesOptions = languagesSelect.getOptions();

        //2. Select all the options from multiple language select dropdown.
        //3. Print out all selected values and verify each is selected.
        for (WebElement eachOption : languagesOptions) {
            languagesSelect.selectByVisibleText(eachOption.getText());
            System.out.println(eachOption.getText());
            assertTrue(eachOption.isSelected(),"Language option did not selected!");
        }

        //4.Deselect all values and verify each is deselected.
        languagesSelect.deselectAll();

        for (WebElement eachOption : languagesSelect.getOptions()) {
            assertFalse(eachOption.isSelected());
        }
    }

    @AfterEach
    public void tearDown(){
        Driver.closeDriver();
    }

}
