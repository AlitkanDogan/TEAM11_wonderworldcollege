@US25
Feature:As an administrator (admin), I would like to be able to view and update the fees so that I can keep the school fees up to date.

  @TC1_US25
  Scenario Outline:In the admin panel's sidebar, under the "Fees Collection" menu, the "Fees Master" page link should be displayed, and when clicked, it should redirect to the "feemaster" page.
    Given The user goes to the "loginUrl" address
    When User sees and clicks the Admin Login Button.
    Then User enters the "<email>" and "<password>" and clicks the Login Button.
    Then Fees Master page link should be displayed under the Fees Collection menu title
    Then Fees Master page link should be clicked and redirected to the feemaster page.
    And User closes the page


    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

  @TC2_US25
  Scenario Outline:On the "feemaster" page, there should be an "Add Fees Master" section with the following fields: Fees Group, Fees Type, Due Date, Amount Percentage (%), Fix Amount, and Fine Type (radio buttons). Additionally, there should be a "Fees Master List"
  section with the columns: Fees Group, Fees Code, Amount, and Action.
    Given The user goes to the "loginUrl" address
    When User sees and clicks the Admin Login Button.
    Then User enters the "<email>" and "<password>" and clicks the Login Button.
    Then Fees Master page link should be displayed under the Fees Collection menu title
    Then Fees Master page link should be clicked and redirected to the feemaster page.
    Then Add Fees Master should be displayed
    Then Fees Group is displayed on the Add Fees Master page
    Then Fees Type is displayed on the Add Fees Master page
    Then Due Date is displayed on the Add Fees Master page
    Then Amount Percantage(%), is displayed on the Add Fees Master page
    Then Fix Amount textBoxes and Fine Type radio buttons and Fees Master List, Fees Group are displayed With
    Then Fix Amount textBoxes and Fine Type radio buttons and Fees Master List, Fees Code are displayed
    Then Fix Amount textBoxes and Fine Type radio buttons and Fees Master List, Amount and Action titles are displayed
    And User closes the page
    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |
