@US19
  Feature:As an administrator (admin), I want to access and update my profile information.

    Background:
      Given The user goes to the "loginUrl" address

    @TC1_US19
    Scenario: The admin panel's top bar should have a visible profile icon.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      Then The user verifies that the admin panel s top bar has a visible profile icon

    @TC2_US19
    Scenario: When clicking on the profile icon in the admin panel's top bar,
    a window should open displaying the account owner's name, role, and links to Profile, Password, and Logout.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
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
      And The user switchs to an other new Admin Login page
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
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that on the Payroll page info boards (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) are visible.

    @TC5_US19
    Scenario: On the Payroll page, the Payslip List should be displayed with columns
    (Month-Year, Date, Mode, Status, Net Salary, Action).

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that, on the Payroll page, the Payslip List are displayed with columns (Month-Year, Date, Mode, Status, Net Salary, Action).

    @TC6_US19
    Scenario: When clicking on the "View Payslip" link under the Action column on the Payslip List,
    the corresponding payslip for that period should be displayed.


      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      And The user clicks on the View Payslip link under the Action column on the Payslip List
      Then The user verifies that, the corresponding payslip for that period is displayed.

    @TC7_US19
    Scenario: The Payroll page should have a search textBox for searching within the Paylist.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that,  the Payroll page has a search textBox for searching within the Paylist.

    @TC8_US19
    Scenario: The Payroll page should allow filtering within the Paylist using menu headings.

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then the user verifies that,  the Payroll page allows filtering within the Paylist using menu headings.

    @TC9_US19
    Scenario: On the Leaves page,
    the Leave List should be displayed with columns (Leave Type, Leave Date, Days, Apply Date, Status, Action).

      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button
      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Leaves link button
      Then The user verifies that,  on the Leaves page, the Leave List is displayed with columns (Leave Type, Leave Date, Days, Apply Date, Status, Action).

















