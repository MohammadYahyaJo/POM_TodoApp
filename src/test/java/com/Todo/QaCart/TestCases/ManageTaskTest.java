package com.Todo.QaCart.TestCases;

import com.Todo.QaCart.Pages.LoginPage;
import com.Todo.QaCart.Pages.NewtodoPage;
import com.Todo.QaCart.Pages.TodoPage;
import com.Todo.QaCart.base.basetest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ManageTaskTest extends basetest {

@Test
    public void AddTask() {

    LoginPage loginPage = new LoginPage(driver);
    String ActualText= loginPage
            .Load()
            .loginapp("newtestemail1@yopmail.com", "Pass@123")
            .ClickonPlusbutton()
            .TaskValue("This is My First Task")
            .SubmitTaskButton()
            .ChecktheTaskName();

    Assert.assertEquals(ActualText, "This is My First Task");

    }

    @Test
    public void DeleteTask() {

        LoginPage loginPage = new LoginPage(driver);
        String ActualText= loginPage
                .Load()
                .loginapp("newtestemail1@yopmail.com", "Pass@123")
                .DeleteTask()
                .MsgNoTask();

        String ExpectedText= "No Available Todos";
        Assert.assertEquals(ActualText,ExpectedText);

    }
}
