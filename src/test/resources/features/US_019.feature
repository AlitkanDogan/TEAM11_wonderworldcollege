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
      And User closes the page

    @TC2_US19
    Scenario: When clicking on the profile icon in the admin panel's top bar,
    a window should open displaying the account owner's name, role, and links to Profile, Password, and Logout.

      Then The user verifies that the admin panel s top bar has a visible profile icon
      And The user clicks on the profile icon on the admin panels top bar.
      Then The user verifies that a window opens displaying the account owner's name, role, and links to Profile, Password, and Logout.
      And User closes the page

    @TC3_US19
    Scenario: On the Profile page, when clicked, there should be transitions
    to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information,
    Address Details, Bank Account Details, and Social Media Link information should be displayed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      Then The user verifies that there are  transitions to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information, Address Details, Bank Account Details, and Social Media Link information should be displayed.
      And User closes the page

    @TC4_US19
    Scenario: The Payroll page should have info boards
    (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) visible.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that on the Payroll page info boards (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) are visible.
      And User closes the page

    @TC5_US19
    Scenario: On the Payroll page, the Payslip List should be displayed with columns
    (Month-Year, Date, Mode, Status, Net Salary, Action).

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that, on the Payroll page, the Payslip List are displayed with columns (Month-Year, Date, Mode, Status, Net Salary, Action).
      And User closes the page

    @TC6_US19
    Scenario: When clicking on the "View Payslip" link under the Action column on the Payslip List,
    the corresponding payslip for that period should be displayed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      And The user clicks on the View Payslip link under the Action column on the Payslip List
      Then The user verifies that, the corresponding payslip for that period is displayed.
      And User closes the page

    @TC7_US19
    Scenario: The Payroll page should have a search textBox for searching within the Paylist.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then The user verifies that,  the Payroll page has a search textBox for searching within the Paylist.
      And User closes the page

    @TC8_US19
    Scenario: The Payroll page should allow filtering within the Paylist using menu headings.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the payroll link button
      Then the user verifies that,  the Payroll page allows filtering within the Paylist using menu headings.
      And User closes the page

    @TC9_US19
    Scenario: On the Leaves page,
    the Leave List should be displayed with columns (Leave Type, Leave Date, Days, Apply Date, Status, Action).

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Leaves link button
      Then The user verifies that,  on the Leaves page, the Leave List is displayed with columns (Leave Type, Leave Date, Days, Apply Date, Status, Action).
      And User closes the page

    @TC10_US19
    Scenario: When clicking on the "view" icon under the Action column on the Leave List,
    the relevant leave information should be displayed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Leaves link button
      And The user clicks on the view icon on the Leaves page below the Action column
      Then The user verifies that, the relevant leave information is displayed.
      And User closes the page

    @TC11_US19
    Scenario: The Attendance page should have info boards (Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) visible.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      Then The user verifies that on the Attendance page, info boards (Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) are visible.
      And User closes the page


    @TC12_US19
    Scenario: On the Attendance page, a selectable attendance year should be available.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      Then The user verifies that on the Attendance page, a selectable attendance year is available.
      And User closes the page

    @TC13_US19
    Scenario: On the Attendance page, there should be an explanation of the letters (P, L, A, F, H) used for attendance marking.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      Then The user verifies that, on the Attendance page, there is an explanation of the letters (P, L, A, F, H) used for attendance marking.
      And User closes the page

    @TC14_US19
    Scenario: On the Attendance page, the Attendance List should display the staff's attendance for the selected month and days.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the profile link
      And The user verifies that they are linked to the profile page
      When The user clicks on the Attendance link button
      And The user clicks on the columns icon
      Then The user verifies that, on the Attendance page, the Attendance List displays the staff's attendance for the selected month and days.
      And User closes the page

    @TC15_US19
    Scenario: when clicking on the profile icon in the admin panel's top bar, the window should display the Password link.
      when clicked, it should open a page with Current Password, New Password, Confirm Password text boxes, and a Change Password button.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the password link
      Then The user verifies that, the password link opens a page with Current Password, New Password, Confirm Password text boxes, and a Change Password button.
      And User closes the page

    @TC16_US19
    Scenario: On the Password page, when valid values are entered in the Current Password, New Password,
    and Confirm Password text boxes, and the Change Password button is clicked, the password should be changed.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the password link
      And The user enters valid values in the Current Password "adminPassword", New Password "newPassword", and Confirm Password "newPasswordConfirm" text boxes
      And The user clicks on the Change Password button.
      Then The user verifies that, the password is changed.
      And User closes the page

    @TC17_US19
    Scenario: When clicking on the Logout link in the window that opens when clicking on the profile icon in the admin panel's top bar,
    the admin should be logged out of the admin panel.

      And The user clicks on the profile icon on the admin panels top bar.
      And The user clicks on the Logout link
      Then The user verifies that, clicking on the Logout link in the window that opens when clicking on the profile icon in the admin panel's top bar, the admin is logged out of the admin panel.
      And User closes the page












