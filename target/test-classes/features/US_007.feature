@US7
Feature: As a user, I want a "Gallery" page on the website to have access to more visuals and pictures related to the school.

  Background:
    Given The user goes to the "url" address

  @TC1_US7
  Scenario: When the 'Gallery' menu title in the top bar of the homepage is clicked, it should redirect to the 'Gallery' page.


    Then The User verifies Gallery tab in Home Page Header
    And The User clicks Gallery tab in Home Page Header
    Then The user verifies that the url of the opened page is ""galleryUrl"".
    And User closes the page


  @TC2_US7
  Scenario: On the 'Gallery' page, it should be verified that there are the following headings: Art & Music, Campus, Activities, Pre Primary, Classrooms, Sports.



    Then The user clicks Gallery tab in Home Page Header
    Then User verifies that  Art & Music title is visible on Gallery page.
    Then User verifies that  Campus  title is visible on Gallery page.
    Then User verifies that  Activities  title is visible on Gallery page.
    Then User verifies that  Pre Primary title is visible on Gallery page.
    Then User verifies that  Classrooms  title is visible on Gallery page.
    Then User verifies that  Sports  title is visible on Gallery page.
    And User closes the page


  @TC3_US7
  Scenario: When clicking on the headings Art & Music, Campus, Activities, Pre Primary, Classrooms, Sports on the 'Gallery' page, it should be verified that they lead to the respective pages.


    Then User clicks Gallery tab on Home Page Title.
    And  User clicks on the ""Art and Music"" heading on the Gallery page.
    Then The user verifies that he or she has viewed the “Arts and Music” board.
    And  User clicks the back button.
    And  User clicks on the Campus banner.
    Then User verifies that he or she is viewing the ""Campus"" board.
    And  User clicks the back button.
    And  User clicks on the Activities banner.
    Then User verifies that he or she is viewing the “Activities” board.
    And  User clicks the back button.
    And  User clicks on the Pre Primary header.
    Then User verifies that they are viewing the “Pre Primary” board.
    And  User clicks the back button.
    And  User clicks on the Classrooms header.
    Then User verifies that he or she has viewed the ""Classrooms"" board.
    And  User clicks the back button.
    And  User clicks on the Sports banner.
    Then User verifies that he or she has viewed the “Sports” board.
    And  User closes the page




