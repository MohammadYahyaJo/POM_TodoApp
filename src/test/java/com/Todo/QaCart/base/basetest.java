package com.Todo.QaCart.base;

import com.Todo.QaCart.Factroy.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest {

   protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver= new DriverFactory().initializeDriver();


    }
    @AfterMethod
    public void tearDown() {
    driver.quit();

    }


}
