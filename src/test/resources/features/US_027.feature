@US27
Feature: As an administrator (admin), I want to view and update fee types in the system,

  @TC1_US27

  Scenario: In the admin panel's sidebar, under the "Fees Collection" menu, the "Fees Type" page link should be displayed, and when clicked, it should redirect to the "feetype" page.


    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then In the sidebar in the Admin panel, the user clicks on the "Fees Type" table under the "Fees Collection" menu heading.
    Then User verifies that the "Fees Type" window opens.
    And User closes the page

  @TC2_US27

  Scenario: On the "feetype" page, there should be an "Add Fees Type" section with the following fields: Name, Fees Code, Description, and a "Save" button. Additionally, there should be a "Fees Type List" section with the columns: Name, Fees Code, and Action.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then In the sidebar in the Admin panel, the user clicks on the "Fees Type" table under the "Fees Collection" menu heading.
    Then The user should verify that there are "Name","Fees Code","Description","Save" buttons in the "Add Fees Type" section of the page that opens.
    Then The user additionally verifies that there are columns "Name","Fees Code","Action" in the "Fees Type List" section of the same page.
    And User closes the page

  @TC3_US27

  Scenario: Valid data should be able to be entered in the "Add Fees Type" window, and when clicking the "Save" button, a new Fees Type record should be created.

    Given The user goes to the "url" address.
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    And The user clicks on the Fees Collection menu item on the sidebar in the Admin panel.
    And In the sidebar in the Admin panel, the user clicks on the "Fees Type" table under the "Fees Collection" menu heading.
    When User verifies that the "Fees Type" window opens.
    Then User must enter valid data in Add Fees Type window and click Save button.
    Then The user should confirm that a new Add Fees Type is created when he clicks the "Save" button.
    And User closes the page

  @TC4_US27

  Scenario: By clicking the edit icon in the "Fees Type List" section, the "Edit Fees Type" window should open, allowing the data to be updated. When clicking the "Save" button, the changes should be saved, and the Fees Type should be updated.

    Given The user goes to the "url" address.
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    And The user clicks on the Fees Collection menu item on the sidebar in the Admin panel.
    And In the sidebar in the Admin panel, the user clicks on the "Fees Type" table under the "Fees Collection" menu heading.
    When The user additionally verifies that there are columns "Name","Fees Code","Action" in the "Fees Type List" section of the same page.
    And User clicks "Edit" icon in "Fees Type List" section.
    And The user updates the data in the "Edit Fees Type" window that opens.
    When The user clicks the "Save" button and confirms that the changes have been saved.
    Then The user should verify that the "Fees Type" section has been refreshed.
    And User closes the page

  @TC4_US27

  Scenario: By clicking the delete icon in the "Fees Type List" section, the selected Fees Type should be able to be deleted from the list.

    Given The user goes to the "url" address.
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    And The user clicks on the Fees Collection menu item on the sidebar in the Admin panel.
    And In the sidebar in the Admin panel, the user clicks on the "Fees Type" table under the "Fees Collection" menu heading.
    Then The user clicks the "Delete" icon in the "Fees Type List" section.
    Then The user deletes the selected Fee Type from the list.
    And User closes the page
