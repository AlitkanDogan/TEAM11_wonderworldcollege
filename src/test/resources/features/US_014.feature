@US14
Feature: As a user, I want an 'OUR EXPERIENCED STAFF' section on the homepage to get to know the school's experienced staff.

  Background: Goes to wonder world college page
    Given The user goes to the "url" address

  @TC1_US14
  Scenario: It should be verified that the "OUR EXPERIENCED STAFFS" section is visible on the homepage.

    When The user scrolls down to the graduates text
    When The user waits 1 seconds
    Then The user verifies that OUR EXPERIENCE STAFFS is visible in our experienced staffs section
    And User closes the page

  @TC2_US14
  Scenario: In the "OUR EXPERIENCED STAFFS" section, it should be verified that the names Anthony Carter, Ava Turner, Davidson Morgan, and Lily Peterson are present.

    When The user goes down to our experienced staffs section on the main page
    When The user waits 1 seconds
    Then The user verifies that Anthony Carter exists in our experienced staffs section
    Then The user verifies that Ava Turner exists in our experienced staffs section
    Then The user verifies that David Morgan exists in our experienced staffs section
    Then The user verifies that Lily Peterson exists in our experienced staffs section
    And User closes the page

