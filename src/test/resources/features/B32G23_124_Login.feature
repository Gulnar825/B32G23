@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
   # Given the user logged in as "<userType>"
    Given the user logged in with username as "<username>" and password as "<password>"

    Examples: HR
      | username        | password |
      | hr1@cydeo.com | UserUser    |
      | hr2@cydeo.com | UserUser    |
      | hr3@cydeo.com | UserUser    |


    Examples: HelpDesk
      | username              | password |
      | helpdesk1@cydeo.com | UserUser    |
      | helpdesk2@cydeo.com | UserUser    |
      | helpdesk3@cydeo.com | UserUser    |


    Examples: Marketing
      |  username              | password |
      | marketing1@cydeo.com | UserUser    |
      | marketing2@cydeo.com | UserUser    |
      | marketing3@cydeo.com | UserUser    |







