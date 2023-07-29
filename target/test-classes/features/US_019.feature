@US19
  Feature:As an administrator (admin), I want to access and update my profile information.

    Background:
      Given The user goes to the "loginUrl" address

    @TC1_US19
    Scenario: The admin panel's top bar should have a visible profile icon.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      Then The user verifies that they are on the "adminSiteLoginUrl" page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      Then The user verifies that the admin panel s top bar has a visible profile icon

    @TC2_US19
    Scenario: When clicking on the profile icon in the admin panel's top bar,
    a window should open displaying the account owner's name, role, and links to Profile, Password, and Logout.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      Then The user verifies that they are on the "adminSiteLoginUrl" page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      Then The user verifies that the admin panel s top bar has a visible profile icon
      And The user clicks on the profile icon on the admin panels top bar.
      Then The user verifies that a window opens displaying the account owner's name, role, and links to Profile, Password, and Logout."

    @TC3_US19
    Scenario: On the Profile page, when clicked, there should be transitions
    to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information,
    Address Details, Bank Account Details, and Social Media Link information should be displayed.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      Then The user verifies that they are on the "adminSiteLoginUrl" page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      Then The user verifies that there are  transitions to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information, Address Details, Bank Account Details, and Social Media Link information should be displayed.

    @TC4_US19
    Scenario: The Payroll page should have info boards
    (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) visible.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      Then The user verifies that they are on the "adminSiteLoginUrl" page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that on the Payroll page info boards (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) are visible.

















