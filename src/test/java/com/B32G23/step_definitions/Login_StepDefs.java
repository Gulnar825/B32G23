package com.B32G23.step_definitions;

import com.B32G23.pages.LoginPage;
import com.B32G23.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;


public class Login_StepDefs extends LoginPage {

    @Then("user logs in as HR")
    public void user_logs_in_as_hr() {
        login(ConfigurationReader.getProperty("Hr_username"), ConfigurationReader.getProperty("password"));
    }

    @Then("user logs in as marketing")
    public void user_logs_in_as_marketing() {
        login(ConfigurationReader.getProperty("Marketing_username"), ConfigurationReader.getProperty("password"));
    }

    @Then("user logs in as helpdesk")
    public void user_logs_in_as_helpdesk() {
        login(ConfigurationReader.getProperty("HelpDesk_username"), ConfigurationReader.getProperty("password"));
    }




}
