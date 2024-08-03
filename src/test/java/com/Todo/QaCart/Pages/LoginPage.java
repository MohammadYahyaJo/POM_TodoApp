package com.Todo.QaCart.Pages;

import com.Todo.QaCart.base.Pagebase;
import com.Todo.QaCart.base.basetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Pagebase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailvalue;
    @FindBy(id = "password")
    private WebElement passwordinput;
    @FindBy(className = "MuiButton-label")
    private WebElement submitbutton;


    public TodoPage loginapp(String Username, String Pass) {
        emailvalue.sendKeys(Username);
        passwordinput.sendKeys(Pass);
        submitbutton.click();
        return new TodoPage(driver) ;
    }

    public LoginPage Load() {
         driver.get("https://todo.qacart.com");
         return new  LoginPage(driver);

    }
}


