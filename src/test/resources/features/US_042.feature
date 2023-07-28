@US42

Feature: As an administrator (teacher), I want a search box in the teacher panel where
  I can search for students by their names for quick access

  @TC1_US42

  Scenario: There should be a visible Search textBox in the top bar of the Teacher panel

    Given The user goes to the 'url' address
    And The user clicks on Teacher Login
    And The user enters his email and password and clicKs on Sign In
    And The user verifies that Search textBox in the top bar of the Teacher panel is displayed."

  @TC2_US42

  Scenario: The Search textBox should have the placeholder text 'Search By Student Name,
  Roll Number, Enroll Number, National Id, Local Id Etc.'

    Given The user goes to the 'url' address
    And The user clicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user verifies that the The Search textBox has the placeholder text 'Search By Student Name, Roll Number, Enroll Number, National Id, Local Id Etc."

  @TC3_US42

  Scenario: When a student name is entered into the Search textbox and searched,
  the matching criteria should display a Student List with columns for Admission List,
  Student Name, Class, Father Name,Date Of Birth, Gender, Category, Mobile Number, and Action.

    Given The user goes to the 'url' address
    And The user clicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user puts a student name into theSearch textbox and search
    And The user verifies that criteria displays Admission List
    And The user verifies that criteria displays Student Name
    And The user verifies that criteria displays Class
    And The user verifies that criteria displays Father Name
    And The user verifies that criteria displays Date Of Birth
    And The user verifies that criteria displays Gender
    And The user verifies that criteria displays Category
    And The user verifies that criteria displays Mobile Number
    And The user verifies that criteria displays Actions"

  @TC4_US42

  Scenario: When the student's name is entered into the Search textBox, the corresponding
  Details View List with student boards should be displayed.

    Given The user goes to 'url' address
    And The user clicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user puts a student name into theSearch textbox and search
    And The user verifies that Details View List with student boards is displayed

  @TC5_US42

  Scenario: The student boards in the Details View List should contain Student Name, Class,
  Admission No, Date Of Birth, Gender, LocalIdentification Number, Guardian Name,
  Guardian Phone, and Current Address.

    Given The user goes to the 'url' address
    And The user clicks on Teacher Login and enters his email and password and clicks on Sign In
    And The user puts a student name into theSearch textbox and search
    And The user clicks on Details View List
    And The user verifies that Details View List contains Student Name
    And The user verifies that Details View List contains Class
    And The user verifies that Details View List contains Admission No
    And The user verifies that Details View List contains Date of Birth
    And The user verifies that Details View List contains Gender
    And The user verifies that Details View List contains Local Identification Number
    And The user verifies that Details View List contains Guardian Name
    And The user verifies that Details View List contains Guardian Phone
    And The user verifies that Details View List containsCurrent Address

  @TC6_US42

  Scenario: In the Details View List, a visible and active Show icon should
  direct to the student's profile page.

    Given The user goes to the 'url' address
    And The user clicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user puts a student name into theSearch textbox and search
    And The user clicks on Details View List
    And The user clicks sees and clicks on Show icon
    And The user goes directly to th student profile page

  @TC7_US42

  Scenario: In the Student List, a visible and active Show icon should direct to
  the student's profile page.

    Given The user goes to ""url""
    And The user clicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user puts a student name into theSearch textbox and search
    And The user clicks on Students List
    And The user clicks sees and clicks on Show icon
    And The user goes directly to th student profile page

  @TC8_US42

  Scenario: Pagination should be enabled in the Student List to navigate between pages.

    Given The user goes to ""url""
    And The userclicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user puts a student name into theSearch textbox and search
    And The user clicks on Students List
    And The user clicks on number 2
    And The user verifies his movement
    And The user goes back to number 1
    And The user verifies his moviment







