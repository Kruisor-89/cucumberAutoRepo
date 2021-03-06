package com.basic.multiSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,//Display the console output in much readable way
        //dryRun = true,//Checks if all the steps have the step definition
        //dryRun = true,
        monochrome = true,
        features = "src/test/resources/multiFF",//The paths of the feature files
        glue = {"com/basic/multiSD/"},//The paths of the step definion files
        plugin={"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-report7.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"}
)
public class RunMultiTest {
}

