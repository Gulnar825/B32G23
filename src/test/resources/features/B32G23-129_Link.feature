Feature: CRM link functionality
  Agile Story: As a user, I should be abel to add link message


  Scenario: Attach a link to the specified text verification
    When User clicks message button and link button in message box
    And  User types "w3link1" in text box
    And User add "https://www.w3schools.com/" in link box
    And User clicks save and send buttons
    Then User should see "w3link1" on the feed

  Scenario: Navigate and open the link text in a new tab verification
    When User clicks link text on the feed
    Then User is on a new page