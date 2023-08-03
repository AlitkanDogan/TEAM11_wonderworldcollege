@US36
Feature: As an administrator (teacher), I want to access the attendance record of a class for a specific day.


  Background:
      Given The user goes to the "loginUrl" address
      When The user verifies that they are on the mainLogin page
      And The user clicks on the Teacher Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their 'teacherLoginFatma' to the mailtextbox
      And The user enters their 'password' to the passwordtextbox
      And The user clicks on the Sign In button
      Then The user verifies that they are on the Teacher panel
      And The user clicks on the Attendance menu button, in the teacher panel's sidebar
      Then The user verifies that the Period Attendance By Date page link is displayed.
      When The user clicks on the Period Attendance By Date page link


  @TC1_US36
  Scenario:In the teacher panel's sidebar, under the "Attendance" menu, the "Period Attendance By Date" page link should be displayed,
  and when clicked, it should redirect to the "reportbydate" page.
    Then The user verifies that, the Period Attendance By Date page link redirects to the reportbydate page.

  @TC2_US36
  Scenario: On the "reportbydate" page, there should be a "Select Criteria" section with Class,
            Section dropdown menus, a Date box, and a Search button visible and active.

      Then The user verifies that, the Period Attendance By Date page link redirects to the reportbydate page.
      Then The user verifies that, on the reportbydate page, there are a Select Criteria section with Class, Section dropdown menus, a Date box, and a Search button visible and active.

  @TC3_US36
  Scenario: Based on the selected criteria in the "Select Criteria" section,
            a "Student List" should be generated with columns for each student and their respective subjects.
      Then The user verifies that, the Period Attendance By Date page link redirects to the reportbydate page.
      When The user selects class, section and date
      And The user clicks on the search button
      Then The user verifies that, based on the selected criteria in the Select Criteria section, a Student List is generated with columns for each student and their respective subjects.

  @TC4_US36
  Scenario: The "Student List" should display the attendance records of all students in the selected class for the specified date.

    Then The user verifies that, the Period Attendance By Date page link redirects to the reportbydate page.
    When The user selects class, section and date
    And The user clicks on the search button
    Then The user verifies that, the Student List displays the attendance records of all students in the selected class for the specified date.