package com.basic.shareDataSD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_lol.BUT;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShareDataStepDef1 {
    WebDriver driver = null;
    public ShareDataStepDef1(SharedClass share){
        driver=share.setup();
    }

    @Then("^User checks user \"([^\"]*)\" first name is present$")
    public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
        String userNameActual = driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).getAttribute("value");
        Assert.assertEquals(userName, userNameActual);
        Thread.sleep(1000);
    }

    @And("^User enters user \"([^\"]*)\" surname$")
    public void user_enters_user_surname(String surName) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys(surName);
        Thread.sleep(1000);
    }

    @Then("^User Mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
        String mobileActual = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).getAttribute("value");
        Assert.assertEquals("", mobileActual);
        Thread.sleep(1000);
    }

}
