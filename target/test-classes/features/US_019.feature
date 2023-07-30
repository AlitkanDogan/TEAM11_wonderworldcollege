@US19
  Feature:As an administrator (admin), I want to access and update my profile information.

    Background:
      Given The user goes to the "loginUrl" address
      When The user verifies that they are on the mainLogin page
      And The user clicks on the Admin Login button.
      And The user switchs to an other new Admin Login page
      And The user enters their mail address and password to the mailtextbox and passwordtextbox
      And The user clicks on the Sign In button

    @TC1_US19
    Scenario: The admin panel's top bar should have a visible profile icon.

      Then The user verifies that the admin panel s top bar has a visible profile icon

    @TC2_US19
    Scenario: When clicking on the profile icon in the admin panel's top bar,
    a window should open displaying the account owner's name, role, and links to Profile, Password, and Logout.

      Then The user verifies that the admin panel s top bar has a visible profile icon
      And The user clicks on the profile icon on the admin panels top bar.
      Then The user verifies that a window opens displaying the account owner's name, role, and links to Profile, Password, and Logout."

    @TC3_US19
    Scenario: On the Profile page, when clicked, there should be transitions
    to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information,
    Address Details, Bank Account Details, and Social Media Link information should be displayed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      Then The user verifies that there are  transitions to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information, Address Details, Bank Account Details, and Social Media Link information should be displayed.

    @TC4_US19
    Scenario: The Payroll page should have info boards
    (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) visible.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that on the Payroll page info boards (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) are visible.

    @TC5_US19
    Scenario: On the Payroll page, the Payslip List should be displayed with columns
    (Month-Year, Date, Mode, Status, Net Salary, Action).

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that, on the Payroll page, the Payslip List are displayed with columns (Month-Year, Date, Mode, Status, Net Salary, Action).

    @TC6_US19
    Scenario: When clicking on the "View Payslip" link under the Action column on the Payslip List,
    the corresponding payslip for that period should be displayed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      And The user clicks on the View Payslip link under the Action column on the Payslip List
      Then The user verifies that, the corresponding payslip for that period is displayed.

    @TC7_US19
    Scenario: The Payroll page should have a search textBox for searching within the Paylist.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that,  the Payroll page has a search textBox for searching within the Paylist.

    @TC8_US19
    Scenario: The Payroll page should allow filtering within the Paylist using menu headings.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then the user verifies that,  the Payroll page allows filtering within the Paylist using menu headings.

    @TC9_US19
    Scenario: On the Leaves page,
    the Leave List should be displayed with columns (Leave Type, Leave Date, Days, Apply Date, Status, Action).

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Leaves link button
      Then The user verifies that,  on the Leaves page, the Leave List is displayed with columns (Leave Type, Leave Date, Days, Apply Date, Status, Action).

    @TC10_US19
    Scenario: When clicking on the "view" icon under the Action column on the Leave List,
    the relevant leave information should be displayed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Leaves link button
      And The user clicks on the view icon on the Leaves page below the Action column
      Then The user verifies that, the relevant leave information is displayed.

    @TC11_US19
    Scenario: The Attendance page should have info boards (Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) visible.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      Then The user verifies that on the Attendance page, info boards (Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) are visible.

    @TC12_US19
    Scenario: On the Attendance page, a selectable attendance year should be available.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      Then The user verifies that on the Attendance page, a selectable attendance year is available.

    @TC13_US19
    Scenario: On the Attendance page, there should be an explanation of the letters (P, L, A, F, H) used for attendance marking.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      Then The user verifies that, on the Attendance page, there is an explanation of the letters (P, L, A, F, H) used for attendance marking.

    @TC14_US19
    Scenario: On the Attendance page, the Attendance List should display the staff's attendance for the selected month and days.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      And The user clicks on the columns icon
      Then The user verifies that, on the Attendance page, the Attendance List displays the staff's attendance for the selected month and days.













