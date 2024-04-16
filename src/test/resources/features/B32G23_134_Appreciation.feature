
Feature: Appreciation tab functionality
  Agile story: As a user, I should be able to send appreciation
  by clicking on Appreciation tab in the Activity Stream




  Scenario: Verify that the user can send an appreciation by filling in the mandatory fields
    Then user logs in as marketing
    Given user is on crm page
    When user clicks More button and user clicks Appreciation button under dropdown
    And user writes appreciation message in mandatory field Message content
    And user clicks send button and sends message to All employees
    Then user sees message on Activity stream page


 Scenario: Verify that the user can send an appreciation by filling in the mandatory fields
   Then user logs in as marketing
   Given user is on crm page
   When user clicks More button and user clicks Appreciation button under dropdown
  And user clicks SENDS button
  Then user sees error message for mandatory fields: "The message title is not specified"

@nerma
  Scenario: Verify that the user can send an appreciation by filling in the mandatory fields
    Then user logs in as marketing
    Given user is on crm page
    When user clicks More button and user clicks Appreciation button under dropdown
    And user writes appreciation message in mandatory field Message content
    And user closes  All employees button
    And user clicks SENDS button
    Then user should see error message: "Please specify at least one person."
@nerma
  Scenario: Verify that the user can send an appreciation by filling in the mandatory fields
    Then user logs in as marketing
    Given user is on crm page
    When user clicks More button and user clicks Appreciation button under dropdown
    And user writes appreciation message in mandatory field Message content
    And user clicks CANCEL button before sending message
    Then user sees Send message area

  @nerma
  Scenario: Verify that the user can send an appreciation by filling in the mandatory fields
    Then user logs in as marketing
    Given user is on crm page
    When user clicks More button and user clicks Appreciation button under dropdown
    And user clicks SENDS button
    Then user sees the delivery button "All employees" by default
