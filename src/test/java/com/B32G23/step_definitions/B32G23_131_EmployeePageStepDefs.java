package com.B32G23.step_definitions;

import com.B32G23.pages.B32G23_131_EmployeePage;
import com.B32G23.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class B32G23_131_EmployeePageStepDefs {

    B32G23_131_EmployeePage b32G23131EmployeePage = new B32G23_131_EmployeePage();

    String expectedDepartmentName;
    private Object CRMUtils;


    @Then("user should be able to see following {int} modules in the Employees page")
    public void user_should_be_able_to_see_following_modules_in_the_employees_page(int expectedModuleNumber, List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(b32G23131EmployeePage.employeeModules);
        Assert.assertEquals(expectedModuleNumber, actualModules.size());
        Assert.assertEquals(expectedModules, actualModules);

    }

    @Then("user should be able to see {string} {word} page")
    public void user_should_be_able_to_see_page_page(String expectedPageTitle, String ignoredWord) {
        String actualPageTitle = b32G23131EmployeePage.pageTitle.getText();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @When("user add department with name {string}")
    public void user_add_department_with_name(String departmentName) {

        expectedDepartmentName= String.valueOf(CRMUtils.getClass());
        b32G23131EmployeePage.createDepartment(expectedDepartmentName);
    }

    @Then("user should see created department")
    public void user_should_see_created_department() {
        BrowserUtils.sleep(3);
        List<String> allDeps = BrowserUtils.getElementsText(b32G23131EmployeePage.allDepartments);
        Assert.assertTrue(allDeps.contains(expectedDepartmentName));

    }


    @Then("user should not see ADD DEPARTMENT button")
    public void user_should_not_see_add_department_button() {

        Assert.assertTrue(b32G23131EmployeePage.btn_addDepartment.isEmpty());

    }
}
