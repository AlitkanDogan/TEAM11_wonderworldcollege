@US22, @d
Feature: As an administrator (admin), I want a page where I can view multi-class students and perform actions like adding or removing students from multi-class.


  Background:
    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    And The user clicks on the Student Information link in the admin panel's sidebar


  @TC1_US22
  Scenario: In the admin panel's sidebar, under the "Student Information" menu, the "Multi Class Student" page link should be displayed.

    Then The user verifies that the dropdown menu displays the ""Multi Class Student"" link
    And User closes the page


  @TC2_US22
  Scenario:Clicking on the "Multi Class Student" link, the "Multiclass" page should be displayed.

    And The user clicks on the Multi Class Student link in the opened dropdown menu
    Then The user verifies that the opened page goes to the "multiClassUrl" address
    And User closes the page

  @TC3_US22
  Scenario: On the "Multiclass" page, Class and Section textBoxes, along with a Search button,
  should be visible to search among the students in the school, and the students should be searchable
  based on the provided criteria the list should be displayed..

    And The user clicks on the Multi Class Student link in the opened dropdown menu
    Then The user verifies that the Class and Section textboxes are visible on the opened page
    And The user clicks on the Class textbox and selects the Class 2 tab from the opened dropdown menu
    And The user clicks on the Section textbox and selects the A tab from the opened dropdown menu
    When The user clicks Search button in Multi Class Student page
    And  The user verifies that the "Select Criteria" heading is visible on the page that opens as a result of the search
    And User closes the page

  @TC4_US22
  Scenario: In the window of the selected student for the update, by clicking the "remove" button, a class should be removed for that student.

    And The user clicks on the Multi Class Student link in the opened dropdown menu
    Then The user verifies that the Class and Section textboxes are visible on the opened page
    And The user clicks on the Class textbox and selects the Class 2 tab from the opened dropdown menu
    And The user clicks on the Section textbox and selects the A tab from the opened dropdown menu
    When The user clicks Search button in Multi Class Student page
    And The user clicks on the + icon in the student's window in the top-left corner
    Then The user verifies that a new section has been added
    When The user enters different class information in ""Class"" and ""Section"" constructors
    And The user clicks ""Update""" button
    Then The user verifies that the class was added successfully.
    And User closes the page

  @TC5_US22
  Scenario:In the window of the selected student for the update, by clicking the "remove" button, a class should be removed for that student.

    And The user clicks on the Multi Class Student link in the opened dropdown menu
    And The user clicks on the Class textbox and selects the Class 2 tab from the opened dropdown menu
    And The user clicks on the Section textbox and selects the A tab from the opened dropdown menu
    When The user clicks Search button in Multi Class Student page
    And Kullanıcı sol üst köşede bulunan ögrenciye ait en altta bulunan sınıf bilgisini ""Remove"" butonuna tıklayarak siler.
    And The user clicks ""Update""" button
    Then The user verifies that the class was added successfully.
    And User closes the page
