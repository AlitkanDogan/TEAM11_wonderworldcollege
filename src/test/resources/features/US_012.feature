@US12

Feature: As a user, I want links to the school's social media accounts on the homepage for easy access.

  Background: Given The user goes to the "url" address

  @TC1_US12
  Scenario: On the homepage navbar, it should be verified that the Follow Us section contains visible icons for Facebook, Twitter, Google, Youtube, Linkedin, Instagram, and Pinterest social media platforms,
  and they redirect to the respective pages when clicked


    And The user verifies that  "Facebook" is displayed in  the Follow Us section
    And The user verifies that 'Twitter' is displayed in the Follow Us section
    And The user verifies that 'Google' is displayed in the Follow Us section
    And The user verifies that  'Youtube' is displayed in the Follow Us section
    And The user verifies that 'Linkedin' is dispalyed in the Follow Us section
    And The user verifies that 'Instagram' is displayed in the Follow Us section
    And The user verifies that 'Interest' is displayed in the Follow Us section
    And The user verifies that 'Facebook' is redirected to itself
    And The user verifies that 'Twitter' is redirected to itself
    And The user verifies that 'Google' is redirected to itself
    And The user verifies that 'YouTube' is redirected to itself
    And The user verifies that 'Linkedin' is redirected to itself
    And The user verifies that 'Instagram' is redirected to itself
    And The user verifies that 'Pinterest' is redirected to itself

  @TC2_US12
  Scenario: In the footer of the homepage, it should be verified that the Follow Us section contains visible icons for Facebook, Twitter, Google, Youtube, Linkedin, Instagram, and Pinterest social media platforms,
  and they redirect to the respective pages when clicked

    And The user verifies that  'Facebook' is displayed in  the Follow Us section
    And The user verifies that 'Twitter' is displayed in the Follow Us section
    And The user verifies that 'Google' is displayed in the Follow Us section
    And The user verifies that  'Youtube' is displayed in the Follow Us section
    And The user verifies that 'Linkedin' is dispalyed in the Follow Us section
    And The user verifies that 'Instagram' is displayed in the Follow Us section
    And The user verifies that 'Interest' is displayed in the Follow Us section
    And The user verifies that 'Facebook' is redirected to itself
    And The user verifies that 'Twitter' is redirected to itself
    And The user verifies that 'Google' is redirected to itself
    And The user verifies that 'YouTube' is redirected to itself
    And The user verifies that 'Linkedin' is redirected to itself
    And The user verifies that 'Instagram' is redirected to itself
    Then The user verifies that 'Pinterest' is redirected to itself"