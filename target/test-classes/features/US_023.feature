@US23
Feature: As an administrator, I want to access all information about enrolled students to gather more details about them.

  Background: Goes to wonder world college page
    Given The user goes to the "loginUrl" address

  @TC1_US23
  Scenario: In the admin panel's sidebar, under the "Student Information" menu, the "Student Information" page link should be displayed, and when clicked, it should redirect to the search page.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    Then The user verifies that the Student Detalis link is displayed in the drop-down menu
    When The user clicks on the Student Detalis link in the drop-down menu
    Then The user verifies from the url she was redirected to the search page
    And User closes the page

  @TC2_US23
  Scenario: On the search page, the "Select Criteria" section should have Class and Section dropdowns, and a Search By Keyword textBox. Two search buttons should be visible and active to perform the search based on the entered criteria.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    Then The user verifies that Class dropdown in Select Criteria is visible
    Then The user verifies that Class dropdown in Select Criteria is active
    Then The user verifies that Section dropdown in Select Criteria is visible
    Then The user verifies Section dropdown in Select Criteria is active
    Then The user verifies that the Search By Keyword textbox in the Select Criteria section is visible
    Then The user verifies that the Search By Keyword textbox in the Select Criteria section is active
    Then The user verifies that the Search buttons in the Select Criteria section are visible
    Then The user verifies that the Search buttons in the Select Criteria section are active
    And User closes the page
