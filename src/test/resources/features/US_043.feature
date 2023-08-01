@US43
Feature: As a user, I should be able to log into the Student Panel with a username and password.


  @TC1_US43
  Scenario: The user must be able to log in with the correct username and password.

    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    Then The user verifies that username texbox, password texbox and Sign In button are visible on the opened page
    And The user enters "studentUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user verifies that the url of the opened page is "studendPageUserUrl".
    And User closes the page

  @TC2_US43
  Scenario Outline: If the username and password combination is incorrect, the user should receive an error message
  "your password or username invalid

    Given The user goes to the "loginUrl" address
    Given The user clicks on the student login tab
    Given The user navigates to a new page that opens in the browser
    Given User enters possible wrong "<username>" or wrong "<password>" in username texbox and in password textbox
    When The user clicks the Sign In button and goes to the admin page
    Given The user should receive an error message your password or username invalid
    Given User closes the page

    Examples:
      | username            | password      |
      | studentUsername_dgn | wrongPassword |
      | wrongUserName       | password_dgn  |
      | wrongUserName       | wrongPassword |

  @TC3_US43
  Scenario: If a user forgets the password, they should be redirected to the "Forgot Password" page.

    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    And The user clicks the Forgot Password link
    Then The user verifies that the title of the page that opens is Forgot Password
    And User closes the page

  @TC4_US43
  Scenario: The new password should be min 6 char

    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    And The user clicks the Forgot Password link
    When The user enters the "studentMail" address on the page that opens
    And The user clicks the studebt radioButton
    And User clicks on Submit button
    Then  The user password change screen will pop up and verify that the 'Email sending failed. Please try again' warning message does not appear
    And User closes the page












