@CreatePoll
Feature: create a poll functionality

  Background:
    Then user logs in as marketing

  Scenario: Verify that the delivery is 'All employees' by default
    Given User clicks on Poll tab under Activity Stream
    Then User should see the delivery set to All employees by default

  Scenario Outline: Verify that the user can create a poll by adding questions and multiple answers
    Given User clicks on Poll tab under Activity Stream
    When User creates a new poll with "<MessageText>" and "<QuestionText>" and "<Answer1Text>" and "<Answer2Text>" and "<Answer3Text>":
    Then User should see the poll created successfully
    Examples:
      | MessageText  | QuestionText  | Answer1Text | Answer2Text | Answer3Text |
      | MessageText1 | Question1Text | Answer1Text | Answer2Text | Answer3Text |


  Scenario: Verify that the user can select the “Allow multiple choice” checkbox
    Given User clicks on Poll tab under Activity Stream
    When User clicks on "Allow multiple choice" checkbox
    Then User should see "Allow multiple choice" checkbox is selected


    Scenario Outline: Verify the corresponding error messages for the mandatory fields
      Given User clicks on Poll tab under Activity Stream
      When User creates a new poll with "<QuestionText>" and "<Answer1Text>" and "<Answer2Text>" and "<Answer3Text>"
      Then User should see Error message: "The message title is not specified"
      When When User creates a new poll with "<MessageText>" and "<QuestionText>" and "<Answer1Text>" and "<Answer2Text>" and "<Answer3Text>" and delete all recipient
      Then User should see Error message: "Please specify at least one person."
      When User creates a new poll with "<MessageText>" and "<Answer1Text>" and "<Answer2Text>" and "<Answer3Text>" without question
      Then User should see Error message: "The question text is not specified."
      When User creates a new poll with "<MessageText>" and "<QuestionText>"
      Then User should see Error message: "The question \"<QuestionText>\" has no answers."
      Examples:
        | MessageText  | QuestionText  | Answer1Text | Answer2Text | Answer3Text |
        | MessageText1 | Question1Text | Answer1Text | Answer2Text | Answer3Text |









