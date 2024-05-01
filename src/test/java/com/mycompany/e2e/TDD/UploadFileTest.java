package com.mycompany.e2e.TDD;

import com.mycompany.pages.UploadFilePage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UploadFileTest {

    @Test
    public void uploadFileTest() {
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        UploadFilePage uploadFilePage = new UploadFilePage();
        uploadFilePage.chooseFileBtn.sendKeys("/Users/orhunakkan/selenium-java-framework/src/test/resources/data/sample.txt");
        uploadFilePage.uploadBtn.click();
        assertEquals(uploadFilePage.headerText.getText(), "File Uploaded!");
        Driver.closeDriver();
    }
}
