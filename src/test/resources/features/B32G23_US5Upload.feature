@best
Feature:File and Image Upload

  Background:
    #Given user logs in as HR
    #Given user logs in as marketing
    Given user logs in as helpdesk

  Scenario Outline: User Uploads Files
    Given the user is on the messaging page

    And the user clicks on upload file
    And the user uploads <fileType> from the path defined in configuration.properties
    And the user inserts the files and images into the text <fileType>

    Examples:
      | fileType     |
      | pdfFilePath  |
      | txtFilePath  |
      | jpgFilePath  |
      | pngFilePath  |
      | docxFilePath |





