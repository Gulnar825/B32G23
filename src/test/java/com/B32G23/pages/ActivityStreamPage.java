package com.B32G23.pages;

import com.B32G23.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Activity Stream']")
    public WebElement activityStreamBtn;

    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollBtn;

    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployees;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesDel;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageTitle;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement question;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answer1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answer2;

    @FindBy(xpath = "//input[@placeholder='Answer  3']")
    public WebElement answer3;

    @FindBy(xpath = "//input[@class='vote-checkbox']")
    public WebElement multipleChoiceCbx;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement infoText;

    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addRecipient;

    @FindBy(xpath = "//div[contains(text(),'All employees')]")
    public WebElement addAllEmployees;


















}
