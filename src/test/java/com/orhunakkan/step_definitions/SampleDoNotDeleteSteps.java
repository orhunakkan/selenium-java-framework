package com.orhunakkan.step_definitions;

import static org.junit.Assert.assertTrue;
import com.orhunakkan.pages.SampleDoNotDeletePage;
import com.orhunakkan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SampleDoNotDeleteSteps {

    SampleDoNotDeletePage loginPage = new SampleDoNotDeletePage();

    @Given("user go to https:\\/\\/www.saucedemo.com\\/")
    public void user_go_to_https_www_saucedemo_com() {
        Driver.getDriver().get("https://www.saucedemo.com/");
    }

    @Then("user sees all the usernames and validate the text of standard username")
    public void user_sees_all_the_usernames_and_validate_the_text_of_standard_username() {
        String allUserNames = loginPage.standardUserName.getText();
        assertTrue(allUserNames.contains("standard_user"));
        Driver.closeDriver();
    }
}
