package com.B32G23.step_definitions;

import com.B32G23.pages.AppreciationPage;
import com.B32G23.utilities.ConfigurationReader;
import com.B32G23.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B32G23_134_AppreciationStepDef {

    AppreciationPage appreciationPage = new AppreciationPage();

    @Given("user is on crm page")
    public void user_is_on_crm_page() {
      //  Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Assert.assertEquals("(5) Portal", Driver.getDriver().getTitle());
    }
    @When("user clicks More button and user clicks Appreciation button under dropdown")
    public void user_clicks_more_button_and_user_clicks_appreciation_button_under_dropdown() {
    appreciationPage.moreButton.click();
    appreciationPage.appreciationSelectButton.click();
    }
    @When("user writes appreciation message in mandatory field Message content")
    public void user_writes_appreciation_message_in_mandatory_field_message_content() {
        appreciationPage.messageAria.sendKeys("Future Sdets");
    }
   // @Then("user sees the delivery button All employees by default")
   // public void user_sees_the_delivery_button_all_employees_by_default() {
   // appreciationPage.AllEmployees.getText();
    //    Assert.assertEquals("All employees", appreciationPage.AllEmployees.getText());}


    @Then("user clicks send button and sends message to All employees")
    public void user_clicks_send_button_and_sends_message_to_all_employees() {
     appreciationPage.sendButton.click();
     appreciationPage.activityStream.click();
    }
    @Then("user sees message on Activity stream page")
    public void user_sees_message_on_activity_stream_page() {
        System.out.println(appreciationPage.activityStreamMessageArea.getText());
        Assert.assertEquals("Future Sdets",  appreciationPage.activityStreamMessageArea.getText());
    }

    @When("user clicks SENDS button")
    public void user_clicks_sends_button() {
        appreciationPage.sendButton.click();
    }


    @Then("user sees error message for mandatory fields: {string}")
    public void user_sees_error_message_for_mandatory_fields(String massageTitleNotSpecified) {
    appreciationPage.errorMessageNotSpecified.getText();
    Assert.assertEquals(appreciationPage.errorMessageNotSpecified.getText(),massageTitleNotSpecified);
    }

    @And("user closes  All employees button")
    public void userClosesAllEmployeesButton() {
        appreciationPage.AllEmployeesX.click();
    }

    @Then("user should see error message: {string}")
    public void userShouldSeeErrorMessage(String errorMassageSpecifyPerson) {
        appreciationPage.errorMessageSpecifyPerson.getText();
        Assert.assertEquals(appreciationPage.errorMessageSpecifyPerson.getText(),errorMassageSpecifyPerson);
    }

    @And("user clicks CANCEL button before sending message")
    public void userClicksCANCELButtonBeforeSendingMessage() {
        appreciationPage.cancelButton.click();
    }

    @Then("user sees Send message area")
    public void userSeesSendMessageArea() {
        appreciationPage.messageAria.isDisplayed();
    }

    @Then("user sees the delivery button {string} by default")
    public void userSeesTheDeliveryButtonByDefault(String AllEmployeeButton) {

        appreciationPage.AllEmployees.getText();
           Assert.assertEquals(AllEmployeeButton, appreciationPage.AllEmployees.getText());}
       // appreciationPage.AllEmployees.isDisplayed();
       // Assert.assertTrue( appreciationPage.AllEmployees.isDisplayed());
    }


