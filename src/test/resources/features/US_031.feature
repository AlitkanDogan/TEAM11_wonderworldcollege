@US31

Feature: As an administrator (admin), I want a page where I can make teacher assignments to classes and make relevant adjustments.

  @TC1_US31

  Scenario: In the admin panel's sidebar, under the "Academics" menu, the "Assign Class Teacher" page link should be displayed, and when clicked, it should redirect to the "assign_class_teacher" page.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    And User closes the page

  @TC2_US31

  Scenario: On the "assign_class_teacher" page, there should be an "Assign Class Teacher" section with Class and Section dropdown menus visible.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user verifies that the "Class" and "Division" drop-down menus are visible on the page that opens.
    And User closes the page


  @TC3_US31

  Scenario: In the "Assign Class Teacher" section on the "assign_class_teacher" page, all teachers with checkboxes should be displayed under the "Class Teacher" column.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    Then The user verifies that in the "Assign Class Teacher" section, all teachers with checkboxes under the "Class Teacher" column are displayed.
    And User closes the page


  @TC4_US31

  Scenario: The "Save" button should be visible in the "Assign Class Teacher" section.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    Then User verifies being displayed from the "Save" control in the "Assign Classroom Teacher" section.
    And User closes the page

  @TC5_US31

  Scenario: In the "Assign Class Teacher" section, by selecting the relevant class and checking the teacher to be assigned, clicking the "Save" button should allow the teacher to be assigned to the selected class.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    Then The user confirms that the teacher has been assigned to the selected class by selecting the "class" and "department" in the "Assign Class Teacher" section, marking the teacher to be assigned, clicking the "Save" button.
    And User closes the page

  @TC6_US31

  Scenario: The "Class Teacher List" should display columns: Class, Section, Class Teacher, and Action.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    Then It is verified that there are Class, Department, Class Teacher and Action columns on the "Class Teacher List" side in the User "Assign Class Teacher" section.
    And User closes the page

  @TC7_US31

  Scenario: Clicking the "Edit" icon under the "Action" column in the "Class Teacher List" should open the "Edit Assign Class Teacher" window, allowing updates to the class-teacher assignment.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    Then The user clicks the "Edit" icon under the "Action" column in the "Classroom List" in the "Assign Classroom Teacher" section.
    Then The user confirms that the classroom teacher assignment has been updated in the "Edit Classroom Teacher Assignment" window.
    And User closes the page

  @TC8_US31

  Scenario: Clicking the "Delete" icon under the "Action" column in the "Class Teacher List" should allow the deletion of the class-teacher assignment.

    Given The user goes to the "loginUrl" address
    When The user clicks on the admin login tab
    And The user navigates to a new page that opens in the browser
    And The user enters "adminUsername_dgn" into the username textbox
    And The user enters "password_dgn" into the password textbox
    When The user clicks the Sign In button and goes to the admin page
    Then The user clicks on the "Academics" menu item on the sidebar in the Admin panel.
    Then The user clicks on the "Assign Class Teacher" page displayed under the "Academics" menu title on the sidebar in the Admin panel.
    Then The user confirms that the page that opens is "assign_class_teacher".
    Then The user clicks the Delete icon under the Action column in the Classroom List in the Assign Classroom Teacher section
    Then The user class-teacher assignment is deleted.
    And User closes the page
