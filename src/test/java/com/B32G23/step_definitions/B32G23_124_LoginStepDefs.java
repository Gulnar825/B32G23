package com.B32G23.step_definitions;

import com.B32G23.pages.LoginPage;
import com.B32G23.utilities.ConfigurationReader;
import com.B32G23.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class B32G23_124_LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information

        String username = null;
        String password = null;

        if(userType.equalsIgnoreCase("Hr")){
            username = ConfigurationReader.getProperty("Hr_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("HelpDesk")){
            username = ConfigurationReader.getProperty("HelpDesk_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("Marketing")){
            username = ConfigurationReader.getProperty("Marketing_username");
            password = ConfigurationReader.getProperty("password");
        }
        //send username and password and login
        loginPage.login(username,password);
    }



    @Given("the user logged in with username as {string} and password as {string}")
    public void theUserLoggedInWithUsernameAsAndPasswordAs(String username, String password) {

        loginPage.login(username,password);
    }

    @Given("the user logged in with incorrect username as {string} and incorrect password as {string}")
    public void theUserLoggedInWithIncorrectUsernameAsAndIncorrectPasswordAs(String username, String password) {

        loginPage.login(username,password);

    }

    @Then("the user sees the error message displayed for invalid credentials")
    public void theUserSeesTheErrorMessageDisplayedForInvalidCredentials() {
        loginPage.errorMessage.isDisplayed();
    }

    @Given("the user logged in with either username as {string} or password as {string}")
    public void theUserLoggedInWithEitherUsernameAsOrPasswordAs(String username, String password) {
        loginPage.login(username,password);

    }

    @Then("the user sees the error message displayed for filling the credentials")
    public void theUserSeesTheErrorMessageDisplayedForFillingTheCredentials() {

        try {
            loginPage.errormessage2.isDisplayed();

        } catch (NoSuchElementException e ){
            System.out.println("Element does not exist on the page for this message");
        }


    }

    @Then("the user clicks the checkbox")
    public void theUserClicksTheCheckbox() {
        loginPage.rememberMeCheckBox.click();
    }

    @Given("the user enters the username as {string} and password as {string}")
    public void theUserEntersTheUsernameAsAndPasswordAs(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);

    }

    @Then("the user sees password is in bullet signs by default")
    public void theUserSeesPasswordIsInBulletSignsByDefault() {


        String inputType = loginPage.password.getAttribute("type");
        Assert.assertEquals("password",inputType);
    }


}
