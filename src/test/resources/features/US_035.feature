Feature:As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.

  @TC1_US35

  Scenario: In the teacher panel's sidebar, under the "Attendance" menu, the "Period Attendance"
  page link should be displayed,and when clicked, it should redirect to the "subjectattendance" page.

    Given The user goes to the "loginUrl" address
    Then User clicks Teacher Login and writes username and password properly
    Then The user clicks Sign in button
    Then User clicks Attandence button
    Then User clicks Period Attandence button and goes through subjectattendance page
    And User closes the page



