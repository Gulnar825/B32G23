package com.B32G23.step_definitions;

import com.B32G23.pages.EmployeePage;
import io.cucumber.java.en.Given;

public class B32G23_130_EmployeesPageStepDefs {

    EmployeePage EmployeesPage = new EmployeePage();

    @Given("a user should be able to access the Employees Page")
    public void a_user_should_be_able_to_access_the_Employees_Page(){

        System.out.println("The user should have access to the login page");
    }
}
