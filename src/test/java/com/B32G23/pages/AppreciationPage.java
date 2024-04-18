package com.B32G23.pages;

import com.B32G23.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageAria;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text'] ")
    public WebElement moreButton;

    @FindBy(xpath = "//span[text()='Appreciation']")
    public WebElement appreciationSelectButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath =  "//span[.='The message title is not specified']")
    public WebElement errorMessageNotSpecified;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorMessageSpecifyPerson;

   @FindBy(xpath = "(//span[.='All employees'])[1]")
    public WebElement AllEmployees;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement activityStreamMessageArea;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement AllEmployeesX;

    @FindBy (xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-link'][1]")
    public WebElement cancelButton;
}
