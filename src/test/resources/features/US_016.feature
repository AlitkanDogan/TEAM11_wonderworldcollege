@US16
Feature: As a registered user (student/parent), I want to have access to the login page from the homepage
  so that I can log in to my personal panel.
  @TC1_US16
  Scenario: The Login button should be visible in the top bar of the homepage,
  and when clicked, it should redirect to the "userlogin" page.

    Given The user goes to the "url" address
    Then The user verifies that, the Login button is visible on the homepage.
    When The user clicks on the Login button
    Then The user verifies that Login button redirects to the userlogin page.

  @TC2_US16
  Scenario: On the "userlogin" page, there should be a login window on the left side
  and information about "What's New In Wonder World College" on the right side.

    Given The user goes to the 'url' address
    When The user clicks on the Login button
    Then The user verifies that there are a login window on the left side and information about What's New In Wonder World College on the right side.

  @TC3_US16
  Scenario: On the "userlogin" page, it should be verified
  that users can log in to their panels by entering their (previously registered) information.

    Given The user goes to the 'url' address
    When The user clicks on the Login button
    And The user enters their username in to the username textbox
    And The user enters their password in to the password textbox
    When The user clicks on the Sign In button
    Then The user verifies that they can log in to their panels by enterin their (previously registered) information.