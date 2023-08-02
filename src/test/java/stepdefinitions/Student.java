package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.StudentPage;
import utilities.Driver;

public class Student {

    WebDriver driver= Driver.getDriver();

    StudentPage studentPage = new StudentPage();

    HomePage homePage = new HomePage();

    //VVVVVVVVVVVVVVVV  US016 VVVVVVVVVVVVVVVVVVV

    @Then("The user verifies that they can log in to their panels by enterin their \\(previously registered) information.")
    public void the_user_verifies_that_they_can_log_in_to_their_panels_by_enterin_their_previously_registered_information() {
        Assert.assertTrue(studentPage.userStudentDashboardPage.isDisplayed());
    }


    //=======================US_47==============================
    @Then("The user verifies that they are on the student panel")
    public void theUserVerifiesThatTheyAreOnTheStudentPanel() {
        Assert.assertTrue(studentPage.studentUserPage.isDisplayed());
    }

    @When("The user clicks on the Homework button link on the student panel")
    public void theUserClicksOnTheHomeworkButtonLinkOnTheStudentPanel() {
        studentPage.homeworkButton.click();
    }

    @Then("The user verifies that, on the homework page, column fields in the Upcoming Homework segment are visible.")
    public void theUserVerifiesThatOnTheHomeworkPageColumnFieldsInTheUpcomingHomeworkSegmentAreVisible() {
        Assert.assertTrue(studentPage.homeworkPage.isDisplayed());
    }
    @And("The user clicks on the viewEdit icon in the action column")
    public void theUserClicksOnTheViewEditIconInTheActionColumn() {
        studentPage.homeworkPageViewEditIcon.click();

    }

    @Then("The user verifies that, they are able to access the homework details")
    public void theUserVerifiesThatTheyAreAbleToAccessTheHomeworkDetails() {

        Assert.assertTrue(studentPage.homeworkDetailsWindow.isDisplayed());
        Assert.assertTrue(studentPage.assignmentMessageTextbox.isEnabled());
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
        Assert.assertTrue(studentPage.AssignmentSubmittedAlert.isDisplayed());
    }

    @And("The user clicks on the Closed Homework linktext")
    public void theUserClicksOnTheClosedHomeworkLinktext() {
        studentPage.closedHomeworkHeadline.click();
    }

    @Then("The user verifies that, Closed Homework list is visible")
    public void theUserVerifiesThatClosedHomeworkListIsVisible() {
        studentPage.closedHomeworkList.isDisplayed();
    }

    @Then("The user verifies that, they are able to send a message in the Closed Homework segment\"")
    public void theUserVerifiesThatTheyAreAbleToSendAMessageInTheClosedHomeworkSegment() {


    }

    //=====================================================
}
