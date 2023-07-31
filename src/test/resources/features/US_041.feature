@US41
Feature: As an administrator (teacher), I want a feature for quick navigation in the teacher panel with quick links.


  Scenario: In the teacher panel's sidebar, the text "Quick Links" and a Quick Links icon should be visible.
    Given User goes to url
    When  "hamza.cicek@teacher.wonderworldcollege.com" "wonderworld123" login teacher
    Then  Quicks Links text and Quicks Links icon should be visible on the sidebar on the teacher panel.
    And Page Closed
