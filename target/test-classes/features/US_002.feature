@US2
Feature: As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.

  Background: Goes to wonder world college page
    Given The user goes to the "url" address

  @TC1_US2
  Scenario: It should be verified that the Latest News information is visible as a scrolling text in the top bar of the homepage.

    Then The user verifies that the Latest News information in the top bar of the home page is visible in scrolling text
    And  User closes the page

  @TC2_US2
  Scenario: It should be verified that the site logo and menu titles (Home, Online Admission, Exam Result, About Us, Academics, Course, Gallery, News, Contact) are visible in the top bar of the homepage.

    Then The user verifies that the site logo in the home page top bar is displayed
    Then The user verifies that the Home menu title on the home page top bar is displayed
    Then The user verifies that the Online Admission menu title in the top bar of the home page is displayed
    Then The user verifies that the Exam Result menu title in the top bar of the home page is displayed
    Then The user verifies that the About Us menu title in the top bar of the home page is displayed
    Then The user verifies that the Academics menu heading in the top bar of the home page is displayed
    Then The user verifies that the Course menu title in the home page top bar is displayed
    Then The user verifies that the Gallery menu title in the home page top bar is displayed
    Then The user verifies that the News menu title in the top bar of the home page is displayed
    Then The user verifies that the Contact menu title in the home page top bar is displayed
    And User closes the page

  @TC3_US2
  Scenario: It should be verified that clicking on the site logo in the top bar refreshes the homepage.

    When The user clicks on the site logo in the home page top bar
    Then The user verifies that their homepage has been refreshed
    And User closes the page

  @TC4_US2
  Scenario: It should be verified that clicking on the menu titles (Home, Online Admission, Exam Result, About Us, Course, Gallery, News, Contact) in the top bar redirects to the respective pages.

    When The user clicks on Home, which is the menu title on the home page top bar
    Then The user verifies that the title is Home on the opened page
    When The user clicks on Online Admission, which is the menu title on the home page top bar
    Then The user verifies that the title is Online Admission Form on the opened page
    When The user clicks on Exam Result, which is the menu title on the home page top bar
    Then The user verifies that the title is Student Exam Result on the opened page
    When The user clicks on About Us, which is the menu title on the home page top bar
    Then The user verifies that the title is About Us on the opened page
    When The user clicks on Course, which is the menu title on the home page top bar
    Then The user verifies that the title is Course on the opened page
    When The user clicks on Gallery, which is the menu title on the home page top bar
    Then The user verifies that the title is Gallery on the opened page
    When The user clicks on News, which is the menu title on the home page top bar
    Then The user verifies that the title is News on the opened page
    When The user clicks on Contact, which is the menu title on the home page top bar
    Then The user verifies that the title is Contact us on the opened page
    And User closes the page

  @TC5_US2
  Scenario: It should be verified that the Academics dropdown menu in the top bar contains the pages: Facilities, School Uniform, Principal Message, Know Us, Approach, Teacher, Houses & Mentoring, Student Council.

    When The user clicks on the Academics menu title at the top of the home page
    Then The user verifies that there is a Facilities link in the drop-down menu
    Then The user verifies that there is a School Uniform link in the drop-down menu
    Then The user verifies that there is a Principal Message link in the drop-down menu
    Then The user verifies that there is a Know Us link in the drop-down menu
    Then The user verifies that there is a Approach link in the drop-down menu
    Then The user verifies that there is a Teacher link in the drop-down menu
    Then The user verifies that there is a Houses & Mentoring link in the drop-down menu
    Then The user verifies that there is a Student Council link in the drop-down menu
    And User closes the page

  @TC6_US2
  Scenario: It should be verified that clicking on the links for Facilities, School Uniform, Principal Message, Know Us, Approach, Teacher, Houses & Mentoring, Student Council in the Academics dropdown menu leads to the respective pages.

    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Facilities link in the drop-down menu
    Then The user confirms that the title is Facilities on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the School Uniform link in the drop-down menu
    Then The user confirms that the title is School Uniform on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Principal Message link in the drop-down menu
    Then The user confirms that the title is Principal Message on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Know Us link in the drop-down menu
    Then The user confirms that the title is Know Us on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Approach link in the drop-down menu
    Then The user confirms that the title is Approach on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Teacher link in the drop-down menu
    Then The user confirms that the title is Teacher on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Houses & Mentoring link in the drop-down menu
    Then The user confirms that the title is Houses & Mentoring on the page that opens
    When The user clicks on the Academics menu title at the top of the home page
    When The user clicks on the Student Council link in the drop-down menu
    Then The user confirms that the title is Student Council on the page that opens
    And User closes the page