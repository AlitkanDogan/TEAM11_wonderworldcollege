@US55
Feature: Kullanıcı Profile Image den Change Username button una access i olmalıdır

  @TC1_US55
  Scenario:

    Given The user goes to the "loginUrl" address
    When  User clicks parent login button
    Then  User enters the email and password and clicks the Login Button
    When User must have an access to Change Username button from Profile Picture
    And User closes the page


