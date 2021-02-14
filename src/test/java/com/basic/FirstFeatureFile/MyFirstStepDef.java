package com.basic.FirstFeatureFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstStepDef {
    WebDriver driver;

    @Given("^User need to be on Facebook login page$")
    public void user_need_to_be_on_Facebook_login_page()    {
        System.setProperty("webdriver.chrome.driver","A:\\CucumberSetup\\drivers-Navegadores\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://es-es.facebook.com/reg/?rs=2&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA2MDY4MDY1LCJjYWxsc2l0ZV9pZCI6Mzc4Mzc1MTU5OTY2NjIxfQ%3D%3D");
    }
    /*^= lambda*/
    @When("^User enters user first name$")
    public void user_enters_user_first_name(){
        driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Luis");
    }

    @Then("^User checks user first name is present$")
    public void user_checks_user_first_name_is_present(){
        String userNameActual=driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).getAttribute("value");
        Assert.assertEquals("Luis",userNameActual);
    }
}
