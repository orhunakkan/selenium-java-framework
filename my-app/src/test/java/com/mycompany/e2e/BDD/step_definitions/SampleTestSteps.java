package com.mycompany.e2e.BDD.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTestSteps {

	private WebDriver driver;
    private String pageTitle;

    @Given("the user has navigated to the Selenium WebDriver Java tutorial page")
    public void navigateToPage() {
        driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    }

    @When("the user retrieves the page title")
    public void retrievePageTitle() {
        pageTitle = driver.getTitle();
    }

    @Then("the page title should be {string}")
    public void verifyPageTitle(String expectedTitle) {
        assertEquals(expectedTitle, pageTitle);
        driver.quit();
    }

}
