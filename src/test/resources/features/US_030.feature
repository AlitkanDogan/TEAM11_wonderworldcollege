@TC1_US30
Feature:As an administrator (admin), I want a page related to school bus routes to update the routes as needed.

  Scenario Outline:The Routes page link should be displayed under the Transport menu title in the sidebar in the admin panel,
  and when clicked, it should redirect to the route page.
    Given The user goes to the "loginUrl" address
    Then User sees and clicks the Admin Login Button.
    When User enters the "<email>" and "<password>" and clicks the Login Button.
    When Move menu appears and clicked in sidebar in admin panel
    When The Routes page link is displayed under the Transport menu title and
    And Clicking the Routes page link under the Transport menu title leads to the route page
    And User closes the page

    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

  @TC2_US30
  Scenario Outline:Route Title textBox and Save button must be active and visible in the Create Route window on the Route page.
    Given The user goes to the "loginUrl" address
    Then User sees and clicks the Admin Login Button.
    When User enters the "<email>" and "<password>" and clicks the Login Button.
    When Move menu appears and clicked in sidebar in admin panel
    When The Routes page link is displayed under the Transport menu title and
    Then Clicking the Routes page link under the Transport menu title leads to the route page
    Then Route Title textBox is active and visible in the Create Route window on the Route page
    Then On the Route page, the Save button is active and visible in the Create Route window.
    And User closes the page
    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |


  @TC3_US30
  Scenario Outline:In the "Create Route" section on the "route" page, when data is entered into the
  Route Title textBox and the "Save" button is clicked, a route record should be created.
    Given The user goes to the "loginUrl" address
    Then User sees and clicks the Admin Login Button.
    When User enters the "<email>" and "<password>" and clicks the Login Button.
    When Move menu appears and clicked in sidebar in admin panel
    When The Routes page link is displayed under the Transport menu title and
    Then Clicking the Routes page link under the Transport menu title leads to the route page
    Then In the Create Route window, data is entered in the Route Title text box and saved
    Then Data is entered in the Route Title textBox, click on the Save button, and save the route.
    And User closes the page

    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

  @TC4_US30
  Scenario Outline:The "Route List" section should display columns: Route Title and Action.
    Given The user goes to the "loginUrl" address
    Then User sees and clicks the Admin Login Button.
    When User enters the "<email>" and "<password>" and clicks the Login Button.
    When Move menu appears and clicked in sidebar in admin panel
    When The Routes page link is displayed under the Transport menu title and
    Then Clicking the Routes page link under the Transport menu title leads to the route page
    When Route List should be displayed with Route Title and Action title
    And User closes the page

    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |

  @TC5_US30
  Scenario Outline:Clicking the "Edit" icon under the "Action" column in the "Route List" should open the
                   "Edit Route" window, allowing necessary updates to be made and saved.
    Given The user goes to the "loginUrl" address
    Then User sees and clicks the Admin Login Button.
    When User enters the "<email>" and "<password>" and clicks the Login Button.
    When Move menu appears and clicked in sidebar in admin panel
    When The Routes page link is displayed under the Transport menu title and
    Then Clicking the Routes page link under the Transport menu title leads to the route page
    When Necessary updates can be made and saved in the Edit Route window
    And User closes the page

    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |


  @TC6_US30
  Scenario Outline:Clicking the "Delete" icon under the "Action" column in the
                  "Route List" should allow the deletion of the route record.
    Given The user goes to the "loginUrl" address
    Then User sees and clicks the Admin Login Button.
    When User enters the "<email>" and "<password>" and clicks the Login Button.
    When Move menu appears and clicked in sidebar in admin panel
    When The Routes page link is displayed under the Transport menu title and
    Then Clicking the Routes page link under the Transport menu title leads to the route page
    When When the delete icon under the Action title is clicked, the record should be deleted.
    And User closes the page

    Examples:
      | email                                      | password       |
      | kubra.tankisi@admin.wonderworldcollege.com | wonderworld123 |