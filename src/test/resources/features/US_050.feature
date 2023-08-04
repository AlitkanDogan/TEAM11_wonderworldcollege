@US50

Feature: As a user, I should be able to access the "Attendance" page and view the attendance details When entering the Student Panel

  @TC1_US50

  Scenario: The user should be able to see the "Attendance" header text.

    Given The user opens the Browser.
    When User goes to Url.
    Then User clicks Parent Login button on Wonder world college page.
    Then User enters valid username in Username textbox on User Login page.
    Then User enters valid password in Password textbox on User Login page.
    Then The user clicks the Sign In button.
    Then The user clicks on the "Attendance" link in the Sidebar of the panel.
    Then The user is verified that the text "Attendance" is displayed on the page that opens
    And User closes the page