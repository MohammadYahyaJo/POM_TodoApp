package com.Todo.QaCart.Pages;

import com.Todo.QaCart.base.Pagebase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class  TodoPage extends Pagebase {

    public TodoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-testid=\"welcome\"]")
    private WebElement welcomemsg;

    @FindBy(css = "[data-testid=\"add\"]")
    private WebElement Plusbutton;

    @FindBy(css = "[data-testid=\"todo-text\"]")
    private WebElement VerifythetaskName;

    @FindBy(css = "[data-testid=\"delete\"]")
    private WebElement DeleteButton;

    @FindBy (css = "[data-testid=\"no-todos\"]")
    private WebElement MsgNoTodos;

    public boolean WelcomeMsgDisplayed() {
        return welcomemsg.isDisplayed();
    }
    public NewtodoPage ClickonPlusbutton () {
        Plusbutton.click();
        return new NewtodoPage(driver);
    }
    public String ChecktheTaskName () {
       return VerifythetaskName.getText();

    }
    public TodoPage DeleteTask() {
        DeleteButton.click();
        return new TodoPage(driver);
    }

    public String MsgNoTask() {
      return   MsgNoTodos.getText();

    }

}




