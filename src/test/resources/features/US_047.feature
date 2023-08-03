@US47
  Feature: As a user, I should be able to access the "Homework" page and make changes to my assignments When entering the Student Panel

    Background:
      Given The user goes to the "url" address
      Then The user verifies that, the Login button is visible on the homepage.
      When The user clicks on the Login button
      Then The user verifies that Login button redirects to the userlogin page.
      And The user enters their "username" in to the username textbox
      And The user enters their "password" in to the password textbox
      When The user clicks on the Sign In button
      Then The user verifies that they are on the student panel
      When The user clicks on the Homework button link on the student panel

    @TC1_US47
    Scenario: The user should be able to view column fields in the "Upcoming Homework" segment


      Then The user verifies that, on the homework page, column fields in the Upcoming Homework segment are visible.

    @TC2_US47
    Scenario: The user should be able to access the homework details and send a message in the "Action" section

      And The user clicks on the viewEdit icon in the action column
      Then The user verifies that, they are able to access the homework details
      And The user enters their messages in to the Assingment message textbox
      And The user clicks on the save button
      Then The user verifies that they are able to send their messages successfully


    @TC3_US47
    Scenario: The user should be able to send a message from the "Action" section in the "Closed Homework" segment


      And The user clicks on the Closed Homework headline
      Then The user verifies that, Closed Homework list is visible
      And The user clicks on the closedHomeworkViewEdit icon in the action column
      And The user enters their messages in to the Assingment message textbox
      And The user clicks on the save button
      Then The user verifies that, they are able to send a message in the Closed Homework segment

    @TC4_US47
    Scenario: The user should be able to enter the "Daily Assignment" segment, click on the "New Assignment" button, and add a new assignment

      And The user clicks on the Daily Assignment link button
      Then The user verifies that they are in the Daily Assignment segment
      And The user clicks on the New Assignment button

    @TC5_US47
    Scenario: The user should be able to update assignments from the "Action" section

      When The user verifies that submitted label is visible below the status
      And The user clicks on the viewEdit icon in the action column
      Then The user verifies that, they are able to access the homework details
      And The user enters their updated  messages in to the Assingment message textbox
      And The user clicks on the save button
      Then The user verifies that, they are able to update their assignments

    @TC6_US47
    Scenario: The user should be able to delete an assignment from the "Action" section

      And The user clicks on the viewEdit icon in the action column
      Then The user verifies that, they are able to access the homework details
      And The user deletes their assignments
      And The user clicks on the save button
      Then The user verifies that, they are able to delete their assignments

    @TC7_US47
    Scenario: The user should verify the column fields in the "Daily Assignment List" page

      And The user clicks on the Daily Assignment link button
      Then The user verifies that, the column fields in the Daily Assignment List page are visible in the Daily Assignment segment




