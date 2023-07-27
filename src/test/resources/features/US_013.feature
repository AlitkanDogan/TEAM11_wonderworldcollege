@US13
  Feature: As a user, I want the contact information of the school to be available on the homepage for easy access.


    @TC1_US13
    Scenario: On the homepage navbar, it should be verified that the school's email address is visible.

    Given The user goes to the "url" address
    Given The user verifies that the 'college mail address' is visible in the navbar section
    Given User closes the page

