@US13
Feature: As a user, I want the contact information of the school to be available on the homepage for easy access.

  Background:
    Given The user goes to the "url" address

  @TC1_US13
  Scenario: On the homepage navbar, it should be verified that the school's email address is visible.


    Given The user verifies that the "collegeMailAddress" is visible in the navbar section
    Given User closes the page

  @TC2_US13
  Scenario: In the footer of the homepage, it should be verified that the school's phone number, email address, and school address information are visible.



    When The user goes to the homepage footer section
    And The user verifies that the school's phone number information is visible in the footer section
    Then The user verifies that the school's email address information is visible in the footer section
    And The user verifies that the school's school address information is visible in the footer section
    And User closes the page

  @TC3_US13
  Scenario: On the homepage top bar, it should be verified that the school's phone information is visible as "Call Us."


    Then The user, on the homepage top bar, it  verify that the school's phone information is visible as 'Call Us'
    And User closes the page


