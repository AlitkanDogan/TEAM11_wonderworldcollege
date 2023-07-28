@U@US33

  Feature: As an administrator (teacher), I want to access students' exam results.

    Background: Given The user goes to the 'url' address

@TC1_US33

   Scenario: In the teacher panel's sidebar, under the "Examination" menu, the "Exam Result" page link should be displayed, and when clicked,
it should redirect to the "examresult" page


And The user  clicks on Teacher Login
And The user enters his email and password and clicKs on Sign In
And The user clicks on Examinations
And The user verifies that the ""Exam Result"" page link is displayed and clicks on it
And The user redirects to the ""examresult page

  @TC2_US33

  Scenario: On the "examresult" page, there should be a "Select Criteria" section with Exam Group, Exam, Session, Class,
  Section dropdown menus, and a Search button visible.


  And user clicks on Teacher Login
  And The user enters his email and password anD clicks on Sign In
  And The user clicks on Examinations
  And The user verifies that the ""Exam Result"" page link is displayed and clicks on it
  And The user redirects to the ""examresult page
  And The user verifies that Select Criteria is displayed
  And The user verifies that Exam Group is displayed
  And The user verifies that Exam is displayed
  And The user verifies that Session is displayed
  And The user verifies that Class is displayed
  And The user verifies that Section is displayed"

    @TC3_US33

    Scenario: The "Exam Result" section should display search results based on the criteria selected in the "Select Criteria" section, with columns: Admission No,
    Roll Number, Student Name, Grand Total, Percent(%), Rank, and Result.


   And The user clicks on Teacher Login
    And The user enters his email and password and clicks on Sign In
    And The user clicks on Examinations
    And The user clicks on Exam Results
    And The user verifies that the Admission No column is displayed
    And The user verifies that the Roll Number column is displayed
    And The user verifies that the Student Name column is displayed
    And The user verifies that the Gran Total column is displayed
    And The user verifies that the Percent(%) column is displayed
    And The user verifies that the Rank column is displayed
    And The user verifies that the Result column is displayed



      @TC4_US33

      Scenario: Clicking on the names of the students listed in the "Exam Result" section should redirect
      to the respective student's profile page.


      And The user clicks on Teacher Login
      And The user enters his email and password and clicks on Sign In
      And The user clicks on Examinations
      And The user clicks on Exam Results
      And The user clicks on Exam Group section then chooses Class1(School Based Grading System)
      And The user clicks on Exam section and then chooses Mid Term
      And The user clicks on Session section and then chooses 2019-20
      And The user clicks on Class section then chooses Class 3
      And The user clicks on Section section and then chooses A
      And The user clicks on Search buttom"



