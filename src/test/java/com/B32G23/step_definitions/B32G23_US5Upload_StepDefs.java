package com.B32G23.step_definitions;

import com.B32G23.pages.FileUpload_US5Page;
import com.B32G23.utilities.BrowserUtils;
import com.B32G23.utilities.ConfigurationReader;
import com.B32G23.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class B32G23_US5Upload_StepDefs {

    FileUpload_US5Page fileUploadUs5Page=new FileUpload_US5Page();
    @Given("^the user is on the messaging page$")
    public void userIsOnMessagingPage() {
        fileUploadUs5Page.message.click();


    }

    @When("^the user clicks on upload file$")
    public void userClicksOnUploadFile() {
        // Implementation for clicking on upload file
        fileUploadUs5Page.uploadFile.click();
    }



    @And("^the user uploads (.*) from the path defined in configuration.properties$")
    public void userUploadsFile(String fileType) {
        String filePath = ConfigurationReader.getProperty(fileType);
        File uploadFile=new File(filePath);
        fileUploadUs5Page.getUploadFile.sendKeys(uploadFile.getAbsolutePath());

    }

    @And("the user inserts the files and images into the text")
    public void theUserInsertsTheFilesAndImagesIntoTheText() {
        fileUploadUs5Page.clickInsertInTextButton();

    }


    @And("the user inserts the files and images into the text <fileType>")
    public void theUserInsertsTheFilesAndImagesIntoTheTextFileType(String fileType) {

        fileUploadUs5Page.verifyFileInsertedIntoTextArea(fileType);
    }
    @Given("the user inserts the files and images into the text pdfFilePath")
    public void the_user_inserts_the_files_and_images_into_the_text_pdf_file_path() {
        fileUploadUs5Page.clickInsertInTextButton();
        fileUploadUs5Page.verifyFileInsertedIntoTextArea("pdf");

//        BrowserUtils.sleep(5);
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
//        try {
//            // Wait for the delete button to be visible
//
//            WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//table[@class='files-list']//td[@class='files-del-btn']/span"));
//            wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
//            // Click on the delete button
//            deleteButton.click();
//            deleteButton.click();
//        } catch (org.openqa.selenium.TimeoutException e) {
//            // Handle TimeoutException if the delete button is not found within the specified time
//            System.out.println("TimeoutException: Delete button not found within the specified time.");
//        }
    }
    @Given("the user inserts the files and images into the text docxFilePath")
    public void the_user_inserts_the_files_and_images_into_the_text_docx_file_path() {
        fileUploadUs5Page.clickInsertInTextButton();
        fileUploadUs5Page.verifyFileInsertedIntoTextArea("docx");
    }
    @Given("the user inserts the files and images into the text txtFilePath")
    public void the_user_inserts_the_files_and_images_into_the_text_txt_file_path() {
        fileUploadUs5Page.clickInsertInTextButton();
        fileUploadUs5Page.verifyFileInsertedIntoTextArea("txtFilePath");
    }
    @Given("the user inserts the files and images into the text jpgFilePath")
    public void the_user_inserts_the_files_and_images_into_the_text_jpg_file_path() {
        fileUploadUs5Page.clickInsertInTextButton();
        fileUploadUs5Page.verifyFileInsertedIntoTextArea("jpgFilePath");
    }
    @Given("the user inserts the files and images into the text pngFilePath")
    public void the_user_inserts_the_files_and_images_into_the_text_png_file_path() {
        fileUploadUs5Page.clickInsertInTextButton();
        fileUploadUs5Page.verifyFileInsertedIntoTextArea("pngFilePath");
    }



//    @Then("the files and images are displayed in the text")
//    public void theFilesAndImagesAreDisplayedInTheText() {
////        fileUploadUs5Page.handleAlert();
////        WebElement frame=Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
////        BrowserUtils.waitFor(5);
////        Driver.getDriver().switchTo().frame(frame);
////
////
////        WebElement insertedFile = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'1708832637970.pdf')]"));
////        if (insertedFile.isDisplayed()) {
////            System.out.println("File is successfully inserted into the text area.");
////        } else {
////            System.out.println("Failed to insert file into the text area.");
////        }
//       fileUploadUs5Page.verifyFileInsertedIntoTextArea(String fileType);
//    }



}
