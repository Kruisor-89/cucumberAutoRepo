package com.basic.shareDataSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareDataStepDef {
    WebDriver driver = null;

    public ShareDataStepDef(SharedClass share){
        driver=share.setup();
    }

    @Given("^User need to be on Facebook login page$")
    public void user_need_to_be_on_Facebook_login_page() {
        driver.get("https://es-es.facebook.com/r.php");
    }

    /*^= lambda*/
    @When("^User enters user \"([^\"]*)\" first name$")
    public void user_enters_user_first_name(String userName) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys(userName);
        Thread.sleep(1000);
    }
}
