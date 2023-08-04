@US3
Feature:As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.


  @TC1_Us3
  Scenario: When the 'Online Admission' menu title in the top bar of the homepage is clicked,
  it should redirect to the 'Online Admission' page.

    Given The user goes to the "url" address
    Then Online Admission button is clicked and displayed on the menu
    And User closes the page

  @TC2_US3
  Scenario:The 'Instructions' section on the 'Online Admission' page should display the school admission criteria.

    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then When user opens the “Online Admission” page, the instruction section should be displayed.
    And User closes the page

  @TC3_US1

  Scenario:The 'Basic Details' section on the 'Online Admission' page should display Class, First Name,
  Last Name, Gender, Date Of Birth, Mobile Number, and Email text boxes, and they should be visible and editable.

    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User completes  Basic details section and writes down under request sections such as; class, first name, last name, gender, date of birth and email.
    Then  The user waits 1 seconds
    Then User completes mobile number and student photo sections
    Then  All of sections which under the “Basic Details” are checked to visibility.
    And User closes the page

  @TC4_US3
  Scenario: It should be verified that a photo of the student can be uploaded in the 'Basic Details' section
  on the 'Online Admission' page.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then User clicks “Student Photo” sections where under “Basic Section” and user uploads photo what user wants on the Online Admission Page.
    And User closes the page

  @TC5_US3
  Scenario: It should be verified that Class, First Name, and Gender text boxes in the 'Basic Details'
  section are mandatory fields that require data input.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User completes  Basic details section and writes down under request sections such as; class, first name, last name, gender, date of birth and email.
    And User closes the page

  @TC6_US3
  Scenario: The 'Parent Detail' section on the 'Online Admission' page should be display Father Name
  and Mother Name text boxes and they should be visible and editable.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User see “Mother and Father” section under the”Basic Details” section in the “Online Admission page” and completes these sections properly.
    And User closes the page

  @TC7_US3
  Scenario: It should be displayed and editable that sections on the 'Guardian Details'


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User check to visibility the sections which under the “Guardian Details”  on the  Online Admission Page.
    Then  User completes properly Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, and Guardian Address text boxes
    And User closes the page

  @TC8_US3
  Scenario: It should be verified that If Guardian Is, Guardian Name, and Guardian Relation text boxes
  in the 'Guardian Details' section are mandatory fields that require data input.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User check to visibility the sections which under the “Guardian Details”  on the  Online Admission Page.
    Then  User completes properly If Guardian is, Guardian Name, Guardian Relation textboxes
    And User closes the page

  @TC9_US3
  Scenario: It should be verified that a photo of the parent can be uploaded in the 'Guardian Details'
  section on the 'Online Admission' page.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds

  @TC10_US3
  Scenario:It should be verified that the 'If Guardian Is' question on the 'Guardian Details' section is
  visible and the radio buttons for Father, Mother, and Other options are visible and selectable.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User clicks one of “If Guardian Is “ section depends on user relation.
    Then User checks Mother,Father,Other sections for visibility
    And User closes the page

  @TC11_US3
  Scenario: The 'Miscellaneous Details' section on the 'Online Admission' page should display National
  Identification Number and Previous School Details text boxes, and they should be visible and editable.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User checks visibility about National Identification Number and Previous School Details text boxes under the Miscellaneous Details.
    Then  User writes down information properly.
    And User closes the page

  @TC12_US3
  Scenario:


  @TC13_US3
  Scenario:As a user I want to completes requests sections after that clicks Submit button and I want to see
  Registration Number.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then User completes informations, user clicks “Submit” button.
    Then After that  User becomes register and user can see Registration number on the Review Entered Details and Status page.
    And User closes the page


  @TC14_US3
  Scenario:It should be verified that the Form Status is 'Not Submitted' and
  the Application Date is the date when the submission was made on the 'Online Admission' page.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then User completes informations, user clicks “Submit” button.
    Then The user can see "Not Submitted" on the Review Entered Details and Status page
    Then The user check that Application Date is the date when the submission was made on the 'Online Admission' page.
    And User closes the page
  @TC15_US3
  Scenario:

  @TC16_US3
  Scenario: On the 'Review Entered Details and Status' page, it should be verified that the
  'I Agree To The Terms And Conditions' checkbox is visible and clickable.


    Given The user goes to the "url" address
    Then  The user clicks Online Admission button
    Then  The user waits 1 seconds
    Then  User completes informations, user clicks “Submit” button.
    Then User checks the 'I Agree To The Terms And Conditions’ button besides the “Submit” button.
    Then User clicks 'I Agree To The Terms And Conditions’ button.
    And User closes the page

  @TC17_US3
  Scenario:After clicking the checkbox, user clicks the Submit button it should display the message
  'Form Has Been Submitted Successfully..!!', and the Form Status should change to 'Submitted'.



    Given The user goes to the "url" address
    Then The user clicks Online Admission button
    Then The user waits 1 seconds
    Then User completes informations, user clicks “Submit” button.
    Then User checks the 'I Agree To The Terms And Conditions’ button besides the “Submit” button.
    Then User clicks 'I Agree To The Terms And Conditions’ button.
    Then User clicks Submit button.
    Then User can see display the message'Form Has Been Submitted Successfully..!!'
    Then Form Status should change to 'Submitted'
    And User closes the page





