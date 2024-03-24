package com.B32G23.pages;

import com.B32G23.utilities.BrowserUtils;
import com.B32G23.utilities.ConfigurationReader;
import com.B32G23.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.overlay.model.LineStyle;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FileUpload_US5Page {


    public FileUpload_US5Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Message']")
    public WebElement message;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFile;

    @FindBy(css = "input.diskuf-fileUploader")
    public WebElement getUploadFile;

    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public List<WebElement> uploadedFiles;

    @FindBy(xpath = "//td[@class='files-info']//span[@class='insert-btn-text']")
    public WebElement insertInTextButtons;


    @FindBy(xpath = "//td[@class='files-info']//span[@class='insert-btn-text']")
    public List<WebElement> insertButtons;

    @FindBy(id = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(css = "tbody.diskuf-placeholder-tbody .del-but")
    public WebElement btnDelete;


    public void switchIframe(){
        Driver.getDriver().switchTo().frame((WebElement) By.id(String.valueOf(iframe)));
    }


    public void clickInsertInTextButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        for (WebElement insertButton : insertButtons) {
            wait.until(ExpectedConditions.elementToBeClickable(insertButton));
            insertButton.click();

            try {
                Thread.sleep(1000); // Add a delay of 1 second between clicks
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    public void handleAlert() {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.dismiss(); // Dismiss the alert
        } catch (Exception e) {
            // No alert present, do nothing
        }
    }

    public void verifyFileInsertedIntoTextArea(String fileType) {
        System.out.println("vvv");

        WebElement frame = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        BrowserUtils.waitFor(5);
        Driver.getDriver().switchTo().frame(frame);

        String filePathKey=fileType;//+"FilePath";

        System.out.println("Generated filePathKey: " + filePathKey);


        String filePath = ConfigurationReader.getProperty(filePathKey); // Retrieve file path from properties
        System.out.println("Retrieved filePath: " + filePath);

        if (filePath == null) {
            System.out.println("File type " + fileType + " is not supported.");
            return;
        }
        String fileName = extractFileName(filePath);


        String fileXpath = String.format("//span[contains(text(), '%s')]", fileName);
        BrowserUtils.waitFor(5);
        WebElement insertedFile = Driver.getDriver().findElement(By.xpath(fileXpath));

        if (insertedFile.isDisplayed()) {
            System.out.println("File " + fileName + " is successfully inserted into the text area.");
        } else {
            System.out.println("Failed to insert file " + fileName + " into the text area.");
        }
    }

    private String extractFileName(String filePath) {
        // Assuming the file path is separated by '\' in Windows
        String[] parts = filePath.split("\\\\");
        return parts[parts.length - 1];
    }
}