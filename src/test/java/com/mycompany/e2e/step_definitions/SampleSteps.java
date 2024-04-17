package com.mycompany.e2e.step_definitions;

import com.mycompany.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleSteps {

    private String pageTitle;

    @Given("the user has navigated to the Selenium WebDriver Java tutorial page")
    public void the_user_has_navigated_to_the_selenium_web_driver_java_tutorial_page() {
        Driver.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/");
    }

    @When("the user retrieves the page title")
    public void the_user_retrieves_the_page_title() {
        pageTitle = Driver.getDriver().getTitle();
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        assertEquals(expectedTitle, pageTitle);
        Driver.closeDriver();
    }
}
