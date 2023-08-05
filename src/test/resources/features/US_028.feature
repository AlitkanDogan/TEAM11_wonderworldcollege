@US28
Feature: As an administrator (admin), I want to add new sources of income to the system to increase school revenues
  Background: Goes to wonder world college page

    Given The user goes to the "loginUrl" address
    When The user clicks Admin Login button on wonder world college page
    When The user enters valid username in Username textbox on Admin Login page
    When The user enters valid password in Password textbox on Admin Login page
    When The user clicks Sing In buton

  @TC1_US28
  Scenario:In the admin panel's sidebar, under the "Income" menu, the "Add Income" page link should be displayed, and when clicked, it should redirect to the "income" page



    And  The user clicks on the Income menu title on the sidebar in the Admin panel
    Then The user verifies that the Add Income page appears in the dropdown header
    And  The user closes the page.


  @TC2_US28
  Scenario: On the "income" page, there should be an "Add Income" section with the following fields: Income Head dropdown menu, Name, Invoice Number, Date, Amount(*), and Description.

    And The user clicks on the Add Income page menu under the Income section in the Admin panel's sidebar.
    And  The user displays the Add Income page link under the Income menu title on the sidebar in the Admin panel.
    And  The user clicks on the Add Income page displayed under the Income menu title on the sidebar in the Admin panel.
    Then The user verifies that the Add Income page has opened.
    Then The user verifies that the Income Head dropdown menu opens.
    Then The user Verifies that the Name textBox is opened.
    Then The user verifies that the Invoice Number textBox is opened.
    Then The user verifies that the Date texBox is opened.
    Then The user verifies that Amount(*) textBox is opened.
    And  The user Confirms Description textBox is opened.
    And  The user closes the page.


  @TC3_US28
  Scenario: On the "income" page, there should be an "Add Income" section with the following fields: Income Head dropdown menu, Name, Invoice Number, Date, Amount(*), and Description.

    And The user clicks on the Add Income page menu under the Income section in the Admin panel's sidebar.
    Then The user verifies that the Add Income page menu is opened under the Income menu heading in the sidebar in the Admin panel.
    And  The user clicks on the Add Income page displayed under the Income menu title on the sidebar in the Admin panel.
    And  Attach Verifies that you can upload documents using the Document description box."


  @TC4_US28
  Scenario:Valid data should be able to be entered in the "Add Income" window, and when clicking the "Save" button, a new Income record should be created.



    And The user clicks on the Add Income page menu under the Income section in the Admin panel's sidebar.
    And The user clicks on the Income Head dropdown menu in the Add Income window and makes a selection.
    And The user clicks on the Name box in the Add Income window.
    And The user enters the necessary data in the Name box.
    And The user clicks on the Invoice Number box in the Add Income window.
    And The user enters the necessary data in the Invoice Number box.
    And The user clicks on the Date box in the Add Income window.
    And The user enters the necessary data in the Date box.
    And The user clicks on the Amount box in the Add Income window.
    And The user enters the necessary data in the Amount box.
    And The user clicks on the Attach Document box in the Add Income window.
    And The user uploads the necessary data in the Attach Document box.
    And The user clicks on the Attach Document box in the Add Income window.
    And The user clicks on the Description box in the Add Income window.
    And The user enters the necessary data in the Description box.
    And The user clicks on the Save button in the Add Income window.
    And The user confirms that a new Income record has been created.


  @TC5_US28
  Scenario: The "Income List" section should display columns: Name, Description, Invoice Number, Date, Income Head, and Amount(*).


    Then The user verifies that the Add Income menu is under the Income menu heading in the sidebar in the Admin panel.
    Then The user verifies that the Income List header exists on the Add Income page.
    Then The user verifies that the Description box exists.
    Then The user verifies that the Invoice Number box is present.
    Then The user verifies that the Date box exists.
    Then The user verifies that the Income Head box is present.
    Then The user verifies that the Amount(*) box displays.

  @TC6_US28
  Scenario:The "Income List" section should have a search box to enable searching for specific data.


    And The user clicks on the Income menu title on the sidebar in the Admin panel.
    And The user clicks on the Add Income title under the Income menu title.
    And The user reaches the Income List section on the Add Income page.
    Then The user verifies that the search box is found in the Income List section.
    Then The user verifies that the search box is working to search the Income List.

  @TC7_US28
  Scenario: The number of records displayed on one page in the "Income List" section should be changeable (e.g., 100/all).


    And The user clicks on the Income menu title on the sidebar in the Admin panel.
    And The user clicks on the Add Income title under the Income menu title.
    And The user reaches the Income List section on the Add Income page.
    And The user reaches the Income List section on the Add Income page.
    And The user clicks 100/All dropdown in Income List.
    Then The user verifies that the number of data (as 100/all) to be displayed on a page in the Income List can be changed. 10. The user closes the page.














