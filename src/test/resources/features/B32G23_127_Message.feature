
@message
Feature: Message functionality

  Background:
    Then user logs in as marketing

  Scenario: Send a message by filling in the mandatory fields verification
    And User clicks message button
    And User clicks send button without a message
    And User should see error message "The message title is not specified"
    And  User types "Hello!" in message input box
    And User closes All employees button
    And User clicks send button
    Then User should see error messages "Please specify at least one person."



  Scenario: Message delivery is to All employees by default verification.
    And User clicks message button
    Then User should see message delivery is to All employees by default

  Scenario: Cancel sending message at any time before sending verification
    And User clicks message button
    And  User types "Hello!" in message input box
    Then User clicks cancel button before sending the message