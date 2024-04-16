package com.B32G23.pages;

import com.B32G23.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageTab;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageAria;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement inputText;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[contains(@id, 'blog_post_body')]")
    public WebElement message;

    @FindBy(xpath = "//div[contains(@id, 'blog_post_body')]/a[1]")
    public WebElement messageLink;

    @FindBy(xpath = "//span[text()='The message title is not specified']")
    public WebElement errorMessage1;

    @FindBy(xpath = "//span[text()='Please specify at least one person.']")
    public WebElement errorMessage2;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextInput;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURLInput;

    @FindBy(className = "adm-btn-save")
    public WebElement saveButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(className = "feed-add-post-destination-text")
    public WebElement allEmployeesBtn;

    @FindBy(css = ".feed-add-post-del-but")
    public WebElement closeAllEmployeesBtn;



}
