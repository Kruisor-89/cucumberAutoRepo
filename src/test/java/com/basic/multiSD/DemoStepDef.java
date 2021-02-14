package com.basic.multiSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoStepDef {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "A:\\CucumberSetup\\drivers-Navegadores\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^User need to be on demo site page$")
    public void user_need_to_be_on_demo_site_page() {
        driver.get("http://demo.automationtesting.in/Register.html");
    }

    @When("^User enters \"([^\"]*)\" first name$")
    public void user_enters_first_name(String firstName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
        Thread.sleep(1000);
    }

    @When("^User enters \"([^\"]*)\" last name$")
    public void user_enters_last_name(String lastName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        Thread.sleep(1000);
    }
    @After
    public void tearDown1() { //irse de éxito
        System.out.println("in after");
        driver.quit();
        driver = null;
    }
}
