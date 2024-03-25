package com.B32G23.step_definitions;

import com.B32G23.pages.MessagePage;
import com.B32G23.utilities.BrowserUtils;
import com.B32G23.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class B32G23_127_MessageStepDefs {

    MessagePage messagePage = new MessagePage();



    @Then("User clicks message button")
    public void user_clicks_message_button() {

        messagePage.messageTab.click();

    }

    @Then("User clicks send button without a message")
    public void user_clicks_send_button_without_a_message() {

        messagePage.sendButton.click();

    }

    @Then("User should see error message {string}")
    public void user_should_see_error_message(String expectedErrorMessage1) {

        String actualErrorMessage1 = messagePage.errorMessage1.getText();
        Assert.assertEquals(expectedErrorMessage1, messagePage.errorMessage1.getText());



    }

    @Then("User types {string} in message input box")
    public void user_types_in_message_input_box(String messageText) {

        Driver.getDriver().switchTo().frame(messagePage.messageAria);
        messagePage.inputText.sendKeys(messageText);
        Driver.getDriver().switchTo().parentFrame();

    }

    @Then("User closes All employees button")
    public void user_closes_all_employees_button() {

        messagePage.closeAllEmployeesBtn.click();

    }

    @Then("User clicks send button")
    public void user_clicks_send_button() {

        messagePage.sendButton.click();

    }

    @Then("User should see error messages {string}")
    public void user_should_see_error_messages(String expectedErrorMessage2) {

        BrowserUtils.sleep(2);
        String actualErrorMessage2 = messagePage.errorMessage2.getText();
        Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);



    }

    @Then("User should see message delivery is to All employees by default")
    public void user_should_see_message_delivery_is_to_all_employees_by_default() {

        if(messagePage.allEmployeesBtn.isDisplayed()){
            System.out.println("Button All employees is displayed by default!!!");
        }else{
            System.out.println("Button All employees is not displayed by default!!!");

        }

    }

    @Then("User clicks cancel button before sending the message")
    public void user_clicks_cancel_button_before_sending_the_message() {

        messagePage.cancelButton.click();

    }


}
