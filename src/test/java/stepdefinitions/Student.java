package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.StudentPage;
import utilities.Driver;

import static org.junit.Assert.*;

public class Student {

    WebDriver driver= Driver.getDriver();

    StudentPage studentPage = new StudentPage();

    HomePage homePage = new HomePage();

    //VVVVVVVVVVVVVVVV  US016 VVVVVVVVVVVVVVVVVVV

    @Then("The user verifies that they can log in to their panels by enterin their \\(previously registered) information.")
    public void the_user_verifies_that_they_can_log_in_to_their_panels_by_enterin_their_previously_registered_information() {
        assertTrue(studentPage.userStudentDashboardPage.isDisplayed());
    }


    //=======================US_47==============================
    @Then("The user verifies that they are on the student panel")
    public void theUserVerifiesThatTheyAreOnTheStudentPanel() {
        assertTrue(studentPage.studentUserPage.isDisplayed());
    }

    @When("The user clicks on the Homework button link on the student panel")
    public void theUserClicksOnTheHomeworkButtonLinkOnTheStudentPanel() {
        studentPage.homeworkButton.click();
    }

    @Then("The user verifies that, on the homework page, column fields in the Upcoming Homework segment are visible.")
    public void theUserVerifiesThatOnTheHomeworkPageColumnFieldsInTheUpcomingHomeworkSegmentAreVisible() {
        assertTrue(studentPage.homeworkPage.isDisplayed());
    }
    @And("The user clicks on the viewEdit icon in the action column")
    public void theUserClicksOnTheViewEditIconInTheActionColumn() {
        studentPage.homeworkPageViewEditIcon.click();

    }

    @Then("The user verifies that, they are able to access the homework details")
    public void theUserVerifiesThatTheyAreAbleToAccessTheHomeworkDetails() {

        assertTrue(studentPage.homeworkDetailsWindow.isDisplayed());
        assertTrue(studentPage.assignmentMessageTextbox.isEnabled());
    }

    @And("The user enters their messages in to the Assingment message textbox")
    public void theUserEntersTheirMessagesInToTheAssingmentMessageTextbox() {
        studentPage.assignmentMessageTextbox.sendKeys("Hier is my homework");

    }

    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        studentPage.AssignmentSaveButton.click();

    }

    @Then("The user verifies that they are able to send their messages successfully")
    public void theUserVerifiesThatTheyAreAbleToSendTheirMessagesSuccessfully() {
        assertTrue(studentPage.AssignmentSubmittedAlert.isDisplayed());
    }

    @And("The user clicks on the Closed Homework headline")
    public void theUserClicksOnTheClosedHomeworkHeadline() {

        studentPage.closedHomeworkHeadline.click();
    }

    @Then("The user verifies that, Closed Homework list is visible")
    public void theUserVerifiesThatClosedHomeworkListIsVisible() {
        studentPage.closedHomeworkList.isDisplayed();
    }

    @And("The user clicks on the closedHomeworkViewEdit icon in the action column")
    public void theUserClicksOnTheClosedHomeworkViewEditIconInTheActionColumn() {
        studentPage.closedHomeworkViewEditIcon.click();
    }

    @Then("The user verifies that, they are able to send a message in the Closed Homework segment")
    public void theUserVerifiesThatTheyAreAbleToSendAMessageInTheClosedHomeworkSegment() {
        assertTrue(studentPage.closedHomeworkSubmittedLabel.isDisplayed());
    }



    //=====================================================
}
