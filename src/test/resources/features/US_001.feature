@US1 @d
Feature: As a user, I want to be able to access the website to use it

  @TC1_US1
  Scenario: The user should be able to access the website from the browser using the given URL and
  The home page should be visible

    Given The user goes to the "url" address
    When It verifies that the logo is visible on the homepage
    And User closes the page
