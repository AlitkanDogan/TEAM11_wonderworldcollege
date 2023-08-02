@US48
Feature: As a user, I should be able to access the "Online Exam" page and make changes and view the Exam details When entering the Student Panel

  Background:
    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    Then The user verifies that username texbox, password texbox and Sign In button are visible on the opened page
    And The user enters "studentUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the student page
    And The use clicks Onleine Exam tab

  @TC1_US48
  Scenario: The user should be able to access and see the column fields in the ""Online Exam"" section, ""Exam View"" from the Action section.

    When The user sees the Upcoming Exam and Closed Exam columns on the page that opens.
    And The user clicks on the view link of the first exam under the Action column.
    Then The user verifies on the quiz title visible on the page that opens.
    And User closes the page

  @TC2_US48
  Scenario: The user enters the ""Closed Exam"" section, they should be able to see the column fields and
            access the ""Exam View"" from the ""Action"" section and see the fields within the field.

    When User clicks on Closed Exam button
    Then The user verifies the visibility of Exam, Quiz, Date From, Date To, Duration, Total Attempt , Attempted, Status, Action titles on the page
    And User closes the page

