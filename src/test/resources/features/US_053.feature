@US53
Feature: As a user, I should be able to log into the Parent Panel with a username and password.

  Scenario: As a User, I should be able to login to the Parent Panel page and be able to login with username and password.
    Given The user should be able to enter username and password in the relevant box
    Then If the user logs in with the wrong data, they should see the warning message The username or password incorrect
    And Page Closed US_53