@B32G23_124
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@B32G23_124_AC01
  Scenario Outline: Verify login with different user types
   # Given the user logged in as "<userType>"
    Given the user logged in with username as "<username>" and password as "<password>"

    Examples: HR
      | username      | password |
      | hr1@cydeo.com | UserUser |
      | hr2@cydeo.com | UserUser |
      | hr3@cydeo.com | UserUser |


    Examples: HelpDesk
      | username            | password |
      | helpdesk1@cydeo.com | UserUser |
      | helpdesk2@cydeo.com | UserUser |
      | helpdesk3@cydeo.com | UserUser |


    Examples: Marketing
      | username             | password |
      | marketing1@cydeo.com | UserUser |
      | marketing2@cydeo.com | UserUser |
      | marketing3@cydeo.com | UserUser |
@B32G23_124_AC2
  Scenario Outline: verify error message displays for invalid credentials
    Given the user logged in with incorrect username as "<username>" and incorrect password as "<password>"
    Then the user sees the error message displayed for invalid credentials
    Examples: HR
      | username      | password |
      | hh1@cydeo.com | UserUser |
      | hr2@cydeo.com | userUser |
      | 3hr@cydeo.com | U2er2#er |


    Examples: HelpDesk
      | username            | password |
      | mdlpdesk1@cydeo.com | UserUser |
      | helpdesk2@cydeo.com | 2453User |
      | helphand8@gmail.com | Userwhat |


    Examples: Marketing
      | username             | password |
      | mawkoting1@cydeo.com | UserUser |
      | marketing2@cydeo.com | Us2kw2er |
      | marketbahs@cycho.com | Userweer |
  @B32G23_124_AC3
  Scenario Outline: verify the fill out this field error message if any credential is missing
    Given the user logged in with either username as "<username>" or password as "<password>"
    Then the user sees the error message displayed for filling the credentials

    Examples: HR
      | username      | password |
      | hr1@cydeo.com |          |
      |               | UserUser |



    Examples: HelpDesk
      | username            | password |
      |                     | UserUser |
      | helpdesk2@cydeo.com |          |



    Examples: Marketing
      | username             | password |
      |                      | UserUser |
      | marketing2@cydeo.com |          |
  @B32G23_124_AC4
  Scenario: verify remember me on this computer link exists and clickable on login page
    Then the user clicks the checkbox
  @B32G23_124_AC5
  Scenario Outline: verify the password is in bullet signs by default
    Given the user enters the username as "<username>" and password as "<password>"
    Then the user sees password is in bullet signs by default

    Examples: HR
      | username      | password |
      | hr1@cydeo.com | UserUser |
      | hr2@cydeo.com | UserUser |
      | hr3@cydeo.com | UserUser |


    Examples: HelpDesk
      | username            | password |
      | helpdesk1@cydeo.com | UserUser |
      | helpdesk2@cydeo.com | UserUser |
      | helpdesk3@cydeo.com | UserUser |


    Examples: Marketing
      | username             | password |
      | marketing1@cydeo.com | UserUser |
      | marketing2@cydeo.com | UserUser |
      | marketing3@cydeo.com | UserUser |







