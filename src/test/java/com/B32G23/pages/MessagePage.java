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

    @FindBy(tagName = "body")
    public WebElement inputText;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[contains(@id, 'blog_post_body')]")
    public WebElement message;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextInput;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURLInput;

    @FindBy(className = "adm-btn-save")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(@id, 'blog_post_body')]/a[1]")
    public WebElement messageLink;

}
