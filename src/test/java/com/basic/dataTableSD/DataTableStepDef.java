package com.basic.dataTableSD;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.BUT;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DataTableStepDef {
    WebDriver driver;

    @Given("^User need to be on Facebook login page$")
    public void user_need_to_be_on_Facebook_login_page()    {
        System.setProperty("webdriver.chrome.driver","A:\\CucumberSetup\\drivers-Navegadores\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://es-es.facebook.com/r.php");
    }
    /*^= lambda*/
    @When("^User enters user \"([^\"]*)\" first name$")
    public void user_enters_user_first_name(String userName) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys(userName);
        Thread.sleep(1000);
    }

    @Then("^User checks user \"([^\"]*)\" first name is present$")
    public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
        String userNameActual=driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).getAttribute("value");
        Assert.assertEquals(userName,userNameActual);
        Thread.sleep(1000);
    }
    @And("^User enters user \"([^\"]*)\" surname$")
    public void user_enters_user_surname(String surName) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys(surName);
        Thread.sleep(1000);
    }
    @BUT("^User Mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
        String mobileActual=driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).getAttribute("value");
        Assert.assertEquals("",mobileActual);
        Thread.sleep(1000);
    }
    @Then("close browser")
    public void close_browser(){
        driver.quit();
        driver=null;
    }
    @When("Enter followind data")
    public void enter_followind_data(DataTable table) throws InterruptedException {
        List<List<String>> data=table.raw();

        for (int i=1;i<data.size();i++){
            String values1=data.get(i).get(0);
            String values2=data.get(i).get(1);
            String values3=data.get(i).get(2);
            System.out.println("Valores :"+values1+","+values2+","+values3);
            driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys(values1);
            driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys(values2);
            driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys(values3);
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).clear();
            Thread.sleep(10000);
        }
    }
}
