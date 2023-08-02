@US10
Feature: As a user, I want the homepage to have a slider featuring pictures related to the school, and I would like the images to change at regular intervals


  Background:
    Given The user goes to the "url" address


  @TC1_US10
  Scenario:It should be verified that there is a slider on the homepage consisting of images

    Then The user verifies that there is a slider of images on the Homepage
    And  User closes the page


  @TC2_US10
  Scenario: On the homepage, it should be verified that the images in the slider change after a certain time on the screen

    Then The user verifies that the pictures change after being on the screen for a certain time in the slider on the homepage
    And  User closes the page


  @TC3_US10
  Scenario: On the homepage, it should be verified that the images in the slider can be manually changed

    Then The user verifies that you can change the images manually on the homepage
    And  User closes the page



