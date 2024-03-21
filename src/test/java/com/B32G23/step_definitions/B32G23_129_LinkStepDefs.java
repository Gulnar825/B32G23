package com.B32G23.step_definitions;

import com.B32G23.pages.BasePage;
import com.B32G23.pages.LoginPage;
import com.B32G23.pages.MessagePage;
import com.B32G23.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class B32G23_129_LinkStepDefs {

    MessagePage messagePage = new MessagePage();


    @When("User clicks message button and link button in message box")
    public void user_clicks_message_button_and_link_button_in_message_box() {

        messagePage.messageTab.click();
        messagePage.linkButton.click();

    }
    @When("User types {string} in text box")
    public void user_types_in_text_box(String linkText) {

        messagePage.linkTextInput.sendKeys(linkText);

    }
    @When("User add {string} in link box")
    public void user_add_in_link_box(String link) {

        messagePage.linkURLInput.sendKeys(link);

    }
    @When("User clicks save and send buttons")
    public void user_clicks_save_and_send_buttons() {

        messagePage.saveButton.click();
        messagePage.sendButton.click();

    }
    @Then("User should see {string} on the feed")
    public void user_should_see_on_the_feed(String expectedMessage) {

        Assert.assertEquals(expectedMessage, messagePage.message.getText());

    }

    @When("User clicks link text on the feed")
    public void userClicksLinkTextOnTheFeed() {

        messagePage.messageLink.click();
    }

    @Then("User is on a new page")
    public void userIsOnANewPage() {

        String currentWindowHandle = Driver.getDriver().getWindowHandle();
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for(String each : allWindows){
            Driver.getDriver().switchTo().window(each);
            System.out.println("Window Title: " + Driver.getDriver().getTitle());
            System.out.println("CurrentUrl: " + Driver.getDriver().getCurrentUrl());

        }
    }
}
