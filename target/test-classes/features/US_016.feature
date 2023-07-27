@US16
Feature: As a registered user (student/parent), I want to have access to the login page from the homepage
  so that I can log in to my personal panel.
  @TC1_US16
Scenario: The Login button should be visible in the top bar of the homepage,
  and when clicked, it should redirect to the "userlogin" page.

    Given Given The user  navigates to the "url"
    When on the homepage, the Login button should be visible and functional.
    And the user clicks on the Login button
    Then the user should be redirected to the ""userlogin" page.





