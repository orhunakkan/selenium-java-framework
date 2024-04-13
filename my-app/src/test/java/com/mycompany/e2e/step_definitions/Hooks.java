package com.mycompany.e2e.step_definitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    private static final ExtentReports extent = new ExtentReports();

    static {
        extent.attachReporter(new ExtentSparkReporter("target/extent-reports.html"));
    }

    private ExtentTest test;

    @Before
    public void beforeScenario(Scenario scenario) {
        test = extent.createTest(scenario.getName());
        test.log(Status.INFO, "Starting scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            test.log(Status.FAIL, "Scenario failed: " + scenario.getName());
        } else {
            test.log(Status.PASS, "Scenario passed: " + scenario.getName());
        }
        extent.flush();
    }

}
