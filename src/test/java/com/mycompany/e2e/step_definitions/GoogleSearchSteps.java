package com.mycompany.e2e.step_definitions;

import com.mycompany.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchSteps {

    @Given("user is on google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user searches for {string} capital")
    public void user_searches_for_capital(String country) {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(country + " capital");
        searchBox.submit();
    }

    @Then("user should see {string} result")
    public void user_should_see_result(String capital) {
        WebElement result = Driver.getDriver().findElement(By.className("Z0LcW"));
        assertEquals(capital, result.getText());
    }
}
