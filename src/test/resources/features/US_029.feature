@US29
Feature: As an administrator (admin), I want a "Complaints" page to see user complaints and assign them for resolution.


  Scenario:  As an administrator (admin), I want a "Complaints" page to see user complaints and assign them for resolution.
    Given "hamza.cicek@admin.wonderworldcollege.com" "wonderworld123" login admin
    Then The Add complain window with Complain Type, Source dropdown menus and Phone, Date, Description, Action Taken, Assigned, Note textBoxes should be displayed on the Complain page
    Then It should be possible to upload the document related to the complaint in the Add complain window on the Complain page
    Then The Complain List with the titles Complain, Complain Type, Name, Phone, Date, Action should be displayed in the Complain List window
    Then The details of the complaint should be displayed in the Edit Complain window opened by clicking the Edit icon under the Action title in the Complain List, it should be updated and saved with the save button
    And Page Closed US_29