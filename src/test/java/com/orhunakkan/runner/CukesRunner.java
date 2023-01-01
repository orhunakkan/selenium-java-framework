package com.orhunakkan.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "summary"
        },
        features = "src/test/resources/features", 
        glue = "com/orhunakkan/step_definitions",
        dryRun = false,
        tags = "",
        publish = true
)

public class CukesRunner {} 