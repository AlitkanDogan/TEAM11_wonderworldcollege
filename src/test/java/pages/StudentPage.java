package pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentPage {

    public StudentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='skin-blue fixed sidebar-mini']")
    public WebElement userStudentDashboardPage;

    @FindBy(xpath = "//*[@class='wrapper']" )
    public WebElement studentUserPage;

    @FindBy(xpath = "//*[@href = 'https://qa.wonderworldcollege.com/user/homework']")
    public WebElement homeworkButton;

    @FindBy(xpath = "(//*[@class='col-md-12'])[1]")
    public WebElement homeworkPage;

    //======================US_47====================

    @FindBy(xpath = "//*[@class='content-wrapper']")
    public WebElement homeworkDetailsWindow;

    @FindBy(id ="assigment_message")
    public WebElement assignmentMessageTextbox;

    @FindBy(xpath = "(//*[@class='fa fa-reorder'])[1]")
    public WebElement homeworkPageViewEditIcon;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement AssignmentSaveButton;

    @FindBy(xpath = "//*[@class='label label-warning'][1]")
    public WebElement AssignmentSubmittedAlert;

    @FindBy(xpath = "//*[@class='closed-exam']")
    public WebElement closedHomeworkHeadline;

    @FindBy(xpath = "//*[@class='content']")
    public WebElement closedHomeworkList;




    //






}

