Feature: As a user, I should be able to access My Profile page.

  Background: user logs in as HR
    Given user logs in as HR

  Scenario: Verify that the user can view the following options on My Profile page.

    When user clicks on myProfile button
    Then user should be able to see five options on my profile



    //1. Verify that the user can view the following options on My Profile page.
    General
    Drive
    Tasks
    Calendar
    Conversations

  //2. Verify that the email under the General tab is the same as the user’s account.


