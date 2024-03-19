package com.B32G23.step_definitions;

import com.B32G23.pages.LoginPage;
import io.cucumber.java.en.Then;


public class Login_StepDefs extends LoginPage {

    @Then("user logs in as HR")
    public void user_logs_in_as_hr() {
        login("Hr_username","password");
    }

    @Then("user logs in as marketing")
    public void user_logs_in_as_marketing() {
        login("Marketing_username","password");
    }

    @Then("user logs in as helpdesk")
    public void user_logs_in_as_helpdesk() {
        login("HelpDesk_username","password");
    }




}
