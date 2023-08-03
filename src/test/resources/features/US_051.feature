@US51
Feature:As a user, I should be able to access the Examinations page and view the relevant exams When entering the Student Panel


  @TC1_US51
  Scenario:When the user enters the Examinations page, they should see the "Exam Schedule" header text.


    Given The user goes to  "url"
    When User clicks Student Login Button.
    And  User enters Username and password.
    And User clicks on Sign in Button.
    Then The user verifies that they are viewing the Examinations menu in the sidebar.
    And The user clicks on the Examinations menu in the sidebar.
    Then The user verifies that it displays Exam Schedule under the Examinations menu item.
    And The user clicks on the Exam Schedule title.
    Then The user verifies that he or she displays the Exam Schedule header text on the page that opens.
    And  The User closes the page


  @TC2_US51
  Scenario: The user should be able to filter exams by typing the exam name in the search box.


    Given The user goes to  "url"
    When User clicks Student Login Button.
    And  User enters Username and password.
    And User clicks on Sign in Button.
    And The user clicks on the Examinations menu in the sidebar.
    And The user clicks on the Exam Schedule title.
    Then User verifies that it displays Search textbox under Exam Schedule header text.
    And User clicks Search textbox.
    And The user types a keyword into the Search textbox (art, music, science…etc.)
    And The user presses the enter key.
    Then The user verifies that the exam table is not displayed.
    And  The user closes the page.


  @TC3_US51
  Scenario:The user should be able to view column fields on the Examinations page.

    Given The user goes to  "url"
    When User clicks Student Login Button.
    And  User enters Username and password.
    And User clicks on Sign in Button.
    And The user clicks on the Examinations menu in the sidebar.
    Then The user verifies that the Exam Schedule column header is displayed.
    Then User verifies that the Exam Result column header is displayed.
    And  The user closes the page.







  @TC4_US51
  Scenario: When the user clicks on an exam, they should be able to see the details page for that specific exam.


  @TC5_US51
  Scenario:The user should be able to view column fields on the details page of an exam.








