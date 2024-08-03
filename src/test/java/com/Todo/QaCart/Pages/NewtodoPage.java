package com.Todo.QaCart.Pages;

import com.Todo.QaCart.base.Pagebase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtodoPage extends Pagebase {


    public NewtodoPage(WebDriver driver) {
        super(driver);


    }

    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement TaskTextValue ;

    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    private WebElement TaskSubmitButton ;

  public NewtodoPage TaskValue(String Taskvalue){
      TaskTextValue.sendKeys(Taskvalue);
      return new NewtodoPage(driver);
  }

    public TodoPage SubmitTaskButton(){
        TaskSubmitButton.click();
        return new TodoPage(driver);
    }
}
