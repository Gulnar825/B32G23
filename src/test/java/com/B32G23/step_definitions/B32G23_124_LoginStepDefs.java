package com.B32G23.step_definitions;

import com.B32G23.pages.LoginPage;
import com.B32G23.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;


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
}
