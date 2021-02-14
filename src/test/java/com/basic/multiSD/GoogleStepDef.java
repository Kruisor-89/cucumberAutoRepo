package com.basic.multiSD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepDef {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "A:\\CucumberSetup\\drivers-Navegadores\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^User need to be on google page$")
    public void user_need_to_be_on_google_page() {
        driver.get("https://www.google.es/");
    }
    @When("^User enters \"([^\"]*)\" search string$")
    public void user_enters_search_string(String search) throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(search);
        Thread.sleep(1000);
    }
    @After
    public void tearDown1() { //irse de éxito
        System.out.println("in after");
        driver.quit();
        driver = null;
    }
}
