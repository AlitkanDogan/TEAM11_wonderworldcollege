@US16
Feature: As a registered user (student/parent), I want to have access to the login page from the homepage
  so that I can log in to my personal panel.

  Background:
    Given The user goes to the "url" address

  @TC1_US16
  Scenario: The Login button should be visible in the top bar of the homepage,
  and when clicked, it should redirect to the "userlogin" page.

    Then The user verifies that, the Login button is visible on the homepage.
    When The user clicks on the Login button
    Then The user verifies that Login button redirects to the userlogin page.

  @TC2_US16
  Scenario: On the "userlogin" page, there should be a login window on the left side
  and information about "What's New In Wonder World College" on the right side.

    When The user clicks on the Login button
    Then The user verifies that there are a login window on the left side and information about What's New In Wonder World College on the right side.

  @TC3_US16
  Scenario: On the "userlogin" page, it should be verified
  that users can log in to their panels by entering their (previously registered) information.

    When The user clicks on the Login button
    And The user enters their username in to the username textbox
    And The user enters their password in to the password textbox
    When The user clicks on the Sign In button
    Then The user verifies that they can log in to their panels by enterin their (previously registered) information.

  @TC4_US16
  Scenario:On the "userlogin" page, it should be verified that users cannot log in to
  their panels if they enter incorrect, missing, or unregistered information.

    When The user clicks on the Login button
    And The user enters incorrect username in to the username textbox
    And The user enters incorrect password in to the password textbox
    When The user clicks on the Sign In button
    Then The user verifies that they can not log in in to their panels if they enter incorrect, missing, or unregistered information."

  @TC5_US16
  Scenario: The "userlogin" page should contain a "forget password" link, and when clicked, it should redirect to the "ufpassword" page.


    When The user clicks on the Login button
    Then The user verifies that Login button redirects to the userlogin page.
    And The user clicks on forget password link
    Then The user verifies that the forget password link redirects to the ufpassword page.

