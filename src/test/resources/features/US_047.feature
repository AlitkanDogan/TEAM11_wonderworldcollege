@US47
  Feature: As a user, I should be able to access the "Homework" page and make changes to my assignments When entering the Student Panel

    Background:
      Given The user goes to the "url" address

    @TC1_US47
    Scenario: The user should be able to view column fields in the "Upcoming Homework" segment

      Then The user verifies that, the Login button is visible on the homepage.
      When The user clicks on the Login button
      Then The user verifies that Login button redirects to the userlogin page.
      And The user enters their "username" in to the username textbox
      And The user enters their "password" in to the password textbox
      When The user clicks on the Sign In button
      Then The user verifies that they are on the student panel
      When The user clicks on the Homework button link on student panel
      Then The user verifies that, on the homework page, column fields in the Upcoming Homework segment are visible.



