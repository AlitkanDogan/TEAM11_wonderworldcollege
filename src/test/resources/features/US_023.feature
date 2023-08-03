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

  @TC3_US23
  Scenario: When searched based on the selected criteria in the Class and Section dropdowns, a List (Admission No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, Action) should be displayed on the search page, containing the relevant information.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    When The user selects relevant criteria from Class dropdown on Select Criteria page
    When The user selects the relevant criteria from the Section dropdown on the Select Criteria page
    When The user clicks Search button on Select Criteria page
    Then The user verifies that a List has been created in the List View according to the relevant criteria
    And User closes the page

  @TC4_US23
  Scenario: Clicking on the student's name in the generated list should redirect to the profile page of the respective student.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    When The user selects relevant criteria from Class dropdown on Select Criteria page
    When The user selects the relevant criteria from the Section dropdown on the Select Criteria page
    When The user clicks Search button on Select Criteria page
    When The user clicks on the student name from the list in the List View
    Then The user verifies from the student name that he or she is redirected to the profile page of the relevant student
    And User closes the page

  @TC5_US23
  Scenario: Clicking on the view icon under the "Action" column should redirect to the profile page of the relevant student.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    When The user selects relevant criteria from Class dropdown on Select Criteria page
    When The user selects the relevant criteria from the Section dropdown on the Select Criteria page
    When The user clicks Search button on Select Criteria page
    When The user clicks the View icon under the Action heading from the list in the List View
    Then The user verifies from the student name that he or she is redirected to the profile page of the relevant student
    And User closes the page


  @TC6_US23
  Scenario: Clicking on the edit icon under the "Action" column should redirect to the edit page of the respective student.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    When The user selects relevant criteria from Class dropdown on Select Criteria page
    When The user selects the relevant criteria from the Section dropdown on the Select Criteria page
    When The user clicks Search button on Select Criteria page
    When The user clicks the Edit icon under the Action title from the list in the List View
    Then The user verifies from the Edit Student article on the page where the relevant student is directed to the edit page
    And User closes the page

  @TC7_US23
  Scenario: On the edit page, the information of the student (Edit Student, Transport Details, Fees Details, Parent Guardian Detail, Address Details, Miscellaneous Details) should be editable, and the edited information should be saved by clicking the Save button.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    When The user selects relevant criteria from Class dropdown on Select Criteria page
    When The user selects the relevant criteria from the Section dropdown on the Select Criteria page
    When The user clicks Search button on Select Criteria page
    When The user clicks the Edit icon under the Action title from the list in the List View
    When The user enters the relevant data in the textboxes in the Edit Student section of the edit page
    When The user enters the relevant data in the textboxes in the Transport Details section of the edit page
    When The user selects corresponding checkboxes in Fees Details on edit page
    When The user enters the relevant data in the textboxes in the Parent Guardian Detail section on the edit page
    When The user enters the relevant data in the textboxes in the Address Details section of the edit page
    When The user enters the relevant data in the textboxes in the Miscellaneous Details section of the edit page
    When The user clicks the Save button on the edit page
    Then The user verifies that the edited information has been recorded
    And User closes the page

  @TC8_US23
  Scenario: Clicking on the "add fees" icon under the "Action" column should redirect to the "add fees" page of the relevant student.

    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton
    When The user clicks on the Student Information menu title in the sidebar in the admin panel
    When The user clicks on the Student Detalis link in the drop-down menu
    When The user selects relevant criteria from Class dropdown on Select Criteria page
    When The user selects the relevant criteria from the Section dropdown on the Select Criteria page
    When The user clicks Search button on Select Criteria page
    When The user clicks Add Fees icon under Action from List in List View
    Then The user verifies from the Student Fees article on the page where the relevant student is directed to the edit page
    And User closes the page
