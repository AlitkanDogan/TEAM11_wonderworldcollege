@US32
Feature: As an administrator (teacher), I want to be able to create exam groups for students.

  Background:
    Given The user goes to the "loginUrl" address
    When The user clicks on the teacher login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "teacherUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    And The user teacher clicks the Exam Group page link under the Examination menu title in the sidebar on the panel

  @TC1_US32
  Scenario: The Exam Group page link is clicked under the Examination menu title on the sidebar on
  the teacher panel, it should redirect to the examgroup page, Name, Description textBoxes, Exam Type dropdown menu and Save button should be visible."


    Then The user verifies that the url of the opened page is "examGroupUrl".
    Then User verifies name textbox
    Then User verifies Exam Type dropdown menu
    Then User Verifies Description textbox
    Then  User verifies that the Save button is visible.
    And User closes the page

  @TC2_US32
  Scenario: After entering the Name in the Add Exam Group window and selecting the Exam Type,
  clicking the Save button should be visible that the new exam group has been registered.

    And The user enters "examName" in NameBox
    When The user selects the relevant field from the Exam Type dropdown menu.
    And Adds "ExamInfo" to User DescriptionBox
    And The user presses the Save button
    Then The user verifies that the text Record Saved Successfully has been seen.
    And The user Type "examName" in the Search... box under User Exam Group List.
    Then The user verifies that the added "examName" is seen in the list
    And User closes the page

  @TC3_US32
  Scenario: Exam Group List (with Name, No Of Exams, Exam Type, Action headings) should be displayed in the Exam Group List
  window and when the (+) icon under the Action heading is clicked, it should redirect to the add exam page.

    Then The user verifies that Name appears under Exam Group List
    Then The user verifies that No Of Exams appears under Exam Group List
    Then The user verifies that under Exam Group List , the title Exam Type appears
    Then The user verifies that the title Action appears under Exam Group List
    Then The user user clicks the + icon under the Action heading
    Then The user, It is verified that the user redirected page is the add exam page
    And User closes the page

    @TC4_US32
    Scenario: Exam Group List The update should be done by running the Edit Exam Group opened when the edit icon
              under the Action title is clicked.

    Then The user confirms that their page has been updated when they click the edit icon under the Action heading
    And User closes the page






