@US51
Feature:As a user, I should be able to access the Examinations page and view the relevant exams When entering the Student Panel



  @TC1_US51
  Scenario:When the user enters the Examinations page, they should see the "Exam Schedule" header text.

    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "studentUsername_mert" into the username textbox
    And The user enters "password_mert" into the password textbox
    When The user clicks the Sign In button and goes to the student page
    Then The user verifies that they are viewing the Examinations menu in the sidebar.
    And The user clicks on the Examinations menu in the sidebar.
    Then The user verifies that it displays Exam Schedule under the Examinations menu item
    And The user clicks on the Exam Schedule title.
    Then The user verifies that he or she displays the Exam Schedule header text on the page that opens
    And  User closes the page

  @TC3_US51
  Scenario:The user should be able to view column fields on the Examinations page.

    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "studentUsername_mert" into the username textbox
    And The user enters "password_mert" into the password textbox
    When The user clicks the Sign In button and goes to the student page
    Then The user verifies that they are viewing the Examinations menu in the sidebar.
    And The user clicks on the Examinations menu in the sidebar.
    Then The user verifies that it displays Exam Schedule under the Examinations menu item
    And The user clicks on the Exam Schedule title.
    Then User verifies that the Exam Result column header is displayed.
    Then The user verifies that the exam table is not displayed.
    And  User closes the page


  @TC2_US51
  Scenario: The user should be able to filter exams by typing the exam name in the search box.

    Given The user goes to the "loginUrl" address
    When The user clicks on the student login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "studentUsername_mert" into the username textbox
    And The user enters "password_mert" into the password textbox
    When The user clicks the Sign In button and goes to the student page
    Then The user verifies that they are viewing the Examinations menu in the sidebar.
    And The user clicks on the Examinations menu in the sidebar.
    Then The user verifies that it displays Exam Schedule under the Examinations menu item
    And The user clicks on the Exam Schedule title.
    Then User verifies that it displays Search textbox under Exam Schedule header text.
    And User sent key 'math' in  Search textbox.
    And The user presses the enter key.
    Then The user verifies that the exam table is not displayed.
    And  User closes the page
















