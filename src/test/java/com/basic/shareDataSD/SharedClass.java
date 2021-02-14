package com.basic.shareDataSD;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedClass {
    WebDriver driver;

    @Before
    public WebDriver setup(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "A:\\CucumberSetup\\drivers-Navegadores\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    @After
    public void tearDown(){
        driver.quit();
        driver=null;
    }
}
