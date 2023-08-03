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
    Then Fees Master (Fees Group, Fees Type, Due Date, Amount Percantage(%), Fix Amount textBoxes and Fine Type radio buttons should be seen
    Then Fees Master List (with Fees Group, Fees Code, Amount, Action titles) should be displayed.
    And User closes the page
    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

  @TC3_US25
  Scenario Outline:There should be a search box in the "Fees Master List" section for performing searches.
    Given The user goes to the "loginUrl" address
    When User sees and clicks the Admin Login Button.
    Then User enters the "<email>" and "<password>" and clicks the Login Button.
    Then Fees Master page link should be displayed under the Fees Collection menu title
    Then Fees Master page link should be clicked and redirected to the feemaster page.
    Then A searchBox appears to search through the Fees Master List
    And User closes the page
    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

    @TC4_US25
    Scenario Outline: Valid values should be able to be entered in the "Add Fees Master" window, and when clicking the "Save" button, a new Fees Master record should be created.
      Given The user goes to the "loginUrl" address
      When User sees and clicks the Admin Login Button.
      Then User enters the "<email>" and "<password>" and clicks the Login Button.
      Then Fees Master page link should be displayed under the Fees Collection menu title
      Then Fees Master page link should be clicked and redirected to the feemaster page.
      Then Add Fees Master should be displayed
      Then Valid values are entered in the Add Fees Master window.
      Then After the valid values are entered in the Add Fees Master window, the Save button is clicked.
      Then After clicking the Save button, a new Fees Master record is made.
      And User closes the page


      Examples:
        | email                                      | password       |
        | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

      @TC5_US25
      Scenario Outline:In the Edit Fees Master window opened by clicking the edit icon in the Fees Master List,
                       the data should be updated and the registered fees should be updated when the Save button is clicked
        Given The user goes to the "loginUrl" address
        When User sees and clicks the Admin Login Button.
        Then User enters the "<email>" and "<password>" and clicks the Login Button.
        Then Fees Master page link should be displayed under the Fees Collection menu title
        Then Fees Master page link should be clicked and redirected to the feemaster page.
        Then Click on the edit icon in the Fees Main List.
        Then Click on the edit icon in the Fees Master List and the Edit Fees Master window opens.
        Then Update data in Edit Fees Master window and click the Save button
        Then In the Edit Fees Master window, the registered fees are updated.
        And User closes the page



        Examples:
          | email                                      | password       |
          | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

        @TC6_US25
        Scenario Outline:The registered fees should be deleted by clicking the delete icon in the Fees Master List.

          Given The user goes to the "loginUrl" address
          When User sees and clicks the Admin Login Button.
          Then User enters the "<email>" and "<password>" and clicks the Login Button.
          Then Fees Master page link should be displayed under the Fees Collection menu title
          Then Fees Master page link should be clicked and redirected to the feemaster page.
          Then Click the delete icon in the Fees Master List and the registered fees are deleted.
          And User closes the page


          Examples:
            | email                                      | password       |
            | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |