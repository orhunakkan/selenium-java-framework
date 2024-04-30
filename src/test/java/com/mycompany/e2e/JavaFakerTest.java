package com.mycompany.e2e;

import com.github.javafaker.Faker;
import com.mycompany.pages.JavaFakerPage;
import com.mycompany.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaFakerTest {

    JavaFakerPage javaFakerPage = new JavaFakerPage();

    @Test
    public void javaFakerTest() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        javaFakerPage.username.sendKeys("Tester");
        javaFakerPage.password.sendKeys("test");
        javaFakerPage.loginBtn.click();
        javaFakerPage.OrderBtn.click();
        Select select = new Select(javaFakerPage.dropdown);
        select.selectByVisibleText("FamilyAlbum");
        javaFakerPage.quantity.sendKeys("5");
        javaFakerPage.CalculateBtn.click();
        Faker faker = new Faker();
        javaFakerPage.customerName.sendKeys(faker.name().firstName());
        javaFakerPage.street.sendKeys(faker.address().streetName());
        javaFakerPage.city.sendKeys(faker.address().city());
        javaFakerPage.zip.sendKeys(faker.address().zipCode().replace("-", ""));
        javaFakerPage.visaBtn.click();
        javaFakerPage.cardNo.sendKeys(faker.business().creditCardNumber().replace("-", ""));
        javaFakerPage.expDate.sendKeys(faker.business().creditCardExpiry().substring(0, 2) + "/"
                + faker.business().creditCardExpiry().substring(2));
        javaFakerPage.processBtn.click();
        assertTrue(javaFakerPage.resultText.isDisplayed());
        Driver.closeDriver();
    }
}
