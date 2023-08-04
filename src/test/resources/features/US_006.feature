@US6
Feature: As a user, I want a "Course" page on the website where I can access detailed information about the courses offered at the school

  Background:
    Given The user goes to the "url" address

  @TC1_US6
  Scenario: When the 'Course' menu title in the top bar of the homepage is clicked, it should redirect to the 'Course' page


    When The user verifies that the "Course" heading is visible in the main page header section
    Then The user clicks on the "Course" heading link.
    Then The user confirms that the title information of the opened page is "Course."
    And User closes the page


  @TC2_US6
  Scenario: On the 'Course' page, it should be verified that the following course headings are visible: English and Literature, Mathematics, Sciences, Social Sciences, History, Arts and Music, Health and Exercise Sciences, Foreign Language, Computer Science.


    When The user clicks on the "Course" heading link.
    Then User verifies that the "English and Literature" course title is visible
    Then User verifies that the "Mathematics" course title is visible
    Then User verifies that the "Sciences" course title is visible
    When The user scrolls down to the History text.
    Then User verifies that the "Social Sciences" course title is visible
    Then User verifies that the "History" course title is visible
    Then User verifies that the "Arts and Music" course title is visible
    When The user scrolls down to the Foreign Language text.
    Then User verifies that the "Health and Exercise Sciences" course title is visible
    Then User verifies that the "Foreign Language" course title is visible
    Then User verifies that the "Computer Science" course title is visible
    And User closes the page

  @TC3_US6

  Scenario: Under each course heading on the 'Course' page, it should be verified that there are 'Details' buttons to access detailed information about each course.


    When The user clicks on the Course heading link.
    Then User verifies that the DETAILS button is visible under the English and Literature course title
    Then User verifies that the DETAILS button is visible under the Mathematics course title
    Then User verifies that the DETAILS button is visible under  the Sciences course title is visible
    When The user scrolls down to the History text.
    Then User verifies that the DETAILS button is visible under  the Social Sciences course title is visible
    Then User verifies that the DETAILS button is visible under  the History course title is visible
    Then User verifies that the DETAILS button is visible under  the Arts and Music course title is visible
    When The user scrolls down to the Foreign Language text.
    Then User verifies that the DETAILS button is visible under  the Health and Exercise Sciences course title is visible
    Then User verifies that the DETAILS button is visible under  the Foreign Language course title is visible
    Then User verifies that the DETAILS button is visible under the Computer Science course title is visible
    And User closes the page

  @TC_US06

  Scenario: When clicking on the Details button for a specific course, it should be verified that the relevant course detail page is accessible.


    When The user clicks on the Course heading link.
    Then User clicks DETAILS button under English and Literature lesson
    Then It is verified that the title of the user opened page is English and Literature
    And User closes the page