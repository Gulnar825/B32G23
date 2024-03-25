package com.B32G23.step_definitions;

import com.B32G23.pages.ActivityStreamPage;
import com.B32G23.pages.MessagePage;
import com.B32G23.utilities.BrowserUtils;
import com.B32G23.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class B32G23_133_CreatePollStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    MessagePage messagePage = new MessagePage();

    @Given("User clicks on Poll tab under Activity Stream")
    public void userClicksOnPollTabUnderActivityStream() {
        activityStreamPage.activityStreamBtn.click();
        activityStreamPage.pollBtn.click();
    }


    @Then("User should see the delivery set to All employees by default")
    public void userShouldSeeTheDeliverySetToAllEmployeesByDefault() {
        Assert.assertTrue(activityStreamPage.allEmployees.isDisplayed());

    }


    @When("User creates a new poll with {string} and {string} and {string} and {string} and {string}:")
    public void userCreatesANewPollWithAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        messagePage.inputText.sendKeys(arg0);

        Driver.getDriver().switchTo().parentFrame();

        activityStreamPage.question.sendKeys(arg1);
        activityStreamPage.answer1.sendKeys(arg2);
        activityStreamPage.answer2.sendKeys(arg3);
        activityStreamPage.answer3.sendKeys(arg4);
        activityStreamPage.sendBtn.click();



    }

    @Then("User should see the poll created successfully")
    public void userShouldSeeThePollCreatedSuccessfully() {

        WebElement newPost = Driver.getDriver().findElement(By.xpath("//div[text()='MessageText1']"));

        Assert.assertTrue(newPost.isDisplayed());

    }

    @When("User clicks on {string} checkbox")
    public void userClicksOnCheckbox(String arg0) {
        activityStreamPage.multipleChoiceCbx.click();


    }

    @Then("User should see {string} checkbox is selected")
    public void userShouldSeeCheckboxIsSelected(String arg0) {

        Assert.assertTrue(activityStreamPage.multipleChoiceCbx.isSelected());
    }

    @When("User creates a new poll with {string} and {string} and {string} and {string}")
    public void userCreatesANewPollWithAndAndAnd(String arg0, String arg1, String arg2, String arg3) {

        activityStreamPage.question.sendKeys(arg0);
        activityStreamPage.answer1.sendKeys(arg1);
        activityStreamPage.answer2.sendKeys(arg2);
        activityStreamPage.answer3.sendKeys(arg3);
        activityStreamPage.sendBtn.click();


    }

    @Then("User should see Error message: {string}")
    public void userShouldSeeErrorMessage(String expectedInfoText) throws InterruptedException {
        Thread.sleep(2000);

        String actualInfoText = activityStreamPage.infoText.getText();

        Assert.assertEquals(expectedInfoText, actualInfoText);


    }

    @When("When User creates a new poll with {string} and {string} and {string} and {string} and {string} and delete all recipient")
    public void whenUserCreatesANewPollWithAndAndAndAndAndDeleteAllRecipient(String arg0, String arg1, String arg2, String arg3, String arg4) {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        messagePage.inputText.sendKeys(arg0);

        Driver.getDriver().switchTo().parentFrame();

        activityStreamPage.question.sendKeys(arg1);
        activityStreamPage.answer1.sendKeys(arg2);
        activityStreamPage.answer2.sendKeys(arg3);
        activityStreamPage.answer3.sendKeys(arg4);

        activityStreamPage.allEmployeesDel.click();
        activityStreamPage.sendBtn.click();


    }


    @When("User creates a new poll with {string} and {string}")
    public void userCreatesANewPollWithAnd(String arg0, String arg1) {
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        messagePage.inputText.sendKeys(arg0);
        messagePage.inputText.sendKeys(arg1);

        Driver.getDriver().switchTo().parentFrame();


        activityStreamPage.question.sendKeys(arg1);

        activityStreamPage.answer1.clear();
        activityStreamPage.answer2.clear();
        activityStreamPage.answer3.clear();


        activityStreamPage.sendBtn.click();


    }

    @When("User creates a new poll with {string} and {string} and {string} and {string} without question")
    public void userCreatesANewPollWithAndAndAndWithoutQuestion(String arg0, String arg1, String arg2, String arg3) {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        messagePage.inputText.clear();
        messagePage.inputText.sendKeys(arg0);

        Driver.getDriver().switchTo().parentFrame();

        activityStreamPage.question.clear();
        activityStreamPage.answer1.clear();
        activityStreamPage.answer2.clear();
        activityStreamPage.answer3.clear();

        activityStreamPage.answer1.sendKeys(arg1);


        activityStreamPage.sendBtn.click();


    }
}
