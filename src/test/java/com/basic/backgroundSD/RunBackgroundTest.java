package com.basic.backgroundSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,//Display the console output in much readable way
        dryRun = false,//Checks if all the steps have the step definition
        features = "src/test/resources/backgroundFF",//The paths of the feature files
        glue = {"com/basic/backgroundSD/"},//The paths of the step definion files
        plugin={"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-report1.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"}
)
public class RunBackgroundTest {
}

