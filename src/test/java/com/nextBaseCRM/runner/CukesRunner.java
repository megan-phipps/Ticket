package com.nextBaseCRM.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
         plugin = "rerun:target/rerun.txt",
         features = "src/test/resources/com/nextBaseCRM/features",
         glue = "com/nextBaseCRM/step_definitions",
         tags = "@login",
         dryRun = true
    )

    public class CukesRunner {}



