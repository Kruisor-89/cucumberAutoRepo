package com.basic.dataTableSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,//Display the console output in much readable way
        //dryRun = true,//Checks if all the steps have the step definition
        features = "src/test/resources/dataTableFF",//The paths of the feature files
        glue = {"com/basic/dataTableSD/"},//The paths of the step definion files
        plugin={"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-report3.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"}
)
public class RunDataTableTest {
}

