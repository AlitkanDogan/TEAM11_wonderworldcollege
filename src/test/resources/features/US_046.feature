@US46

  Feature: As a user, I should be able to view all fields when I access "My Profile", When entering the Student Panel

@TC1_US46

Scenario: As a user, I should be able to view the Student's name,
Admission No, Class, Section, and Gender.

Given The user goes to the 'url' address
And The user clicks on Student Login
And The user enters Usarname and Password and clicks on Sign In
And The user clicks on My Perfile
And The user goes down
And The user verifies that Student's name is displayed
And The user verifies that Admission No is displayed
And he user verifies that Class is displayed
And The user verifies that Section is displayed
And The user verifies that Gender is displayed"

  @TC2_US46

  Scenario: As a user, I should be able to view the Profile, Fees, Exam, and Documents segments.

    Given The user goes to the 'url' address
  And The user clicks on Student Login
  And The user enters Usarname and Password and clicks on Sign In
  And The user clicks on My Perfile
  And The user goes down
  And The user verifies that Profile segment is displayed
  And The user verifies that Fees segment is displayed
  And The user verifies that Exam segment is displayed
  And The user verifies that Document segment is displayed"

    @TC3_US46

    Scenario: As a user, you should be able to see the functions of the Profile, Fees,
    Exam, and Documents segments
      Given The user goes to the 'url' address
    And The user clicks on Student Login
    And The user enters Usarname and Password and clicks on Sign In
    And The user clicks on My Perfile
    And The user goes down
    And The user clicks on Profile segment
    And The user clicks on Fees segment
    And The user clicks on Exam segment
    And The user clicks on Document segment


      @TC4_US46

      Scenario: As a user, should I be able to see the fields under the Profile section

      Given The user goes to the 'url' address
      And The user clicks on Student Login
      And The user enters Usarname and Password and clicks on Sign In
      And The user clicks on My Perfile
      And The user goes down
      And The user clicks on Profile segment
      And The user verifies that  fields under the Profile section is displayed"

        @TC5_US46

        Scenario: As a user, should I be able to see the fields under the Fees section

        Given The user goes to the 'url' address
        And The user clicks on Student Login
        And The user enters Usarname and Password and clicks on Sign In
        And The user clicks on My Perfile
        And The user goes down
        And The user clicks on Profile segment
        And The user verifies that  fields under the Fees section is displayed"

          @TC6_US46

          Scenario: As a user, should I be able to see the fields under the Exam section

          Given The user goes to the 'url' address
          And user clicks on Student Login
          And The user enters Usarname and Password and clicks on Sign In
          And The user clicks on My Perfile
          And The user goes down
          And The user clicks on Profile segment
          And The user verifies that  fields under the Exam section is displayed"

            @TC7_US46

            Scenario: As a user, should I be able to see the fields under the Documents section

            Given The user goes to the 'url' address
            And The user clicks on Student Login
            And The user enters Usarname and Password and clicks on Sign In
            And The user clicks on My Perfile
            And The user goes down
            And The user clicks on Profile segment
            And The user verifies that  fields under the Documents section is displayed"



