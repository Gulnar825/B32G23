package com.B32G23.pages;


import com.B32G23.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(css = ".login-btn")
    public WebElement loginBtn;

    @FindBy(css=".errortext")
    public WebElement errorMessage;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeCheckBox;

    @FindBy(id = "errortext2")
    public WebElement errormessage2;

    public void login(String inputUsername, String inputPassword) {
        username.sendKeys(inputUsername);
        password.sendKeys(inputPassword);
        loginBtn.click();
        // verification that we logged
    }

}
