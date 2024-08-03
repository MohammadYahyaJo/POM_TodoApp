package com.Todo.QaCart.TestCases;

import com.Todo.QaCart.Pages.LoginPage;
import com.Todo.QaCart.Pages.TodoPage;
import com.Todo.QaCart.base.Pagebase;
import com.Todo.QaCart.base.basetest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
@Feature("Verify Login Working Correctly ")
public class loginTest extends basetest {
@Story("Basic Login Username Password")
    @Test
@Description ("Login by the UI")
    public void logintest () {

        LoginPage loginPage = new LoginPage(driver);
        boolean Result =  loginPage
                .Load()
                .loginapp("newtestemail1@yopmail.com", "Pass@123")
                .WelcomeMsgDisplayed();
        Assert.assertTrue(Result);

    }
}
