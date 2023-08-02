@US57
Feature: As a user, I should be able to log into the Student Panel with a username and password.

  Background:
    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    Then The user verifies that username texbox, password texbox and Sign In button are visible on the opened page
    And The user enters "teacherUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the student page

  @TC1_US57
  Scenario: The user must be able to log in with the correct username and password.

