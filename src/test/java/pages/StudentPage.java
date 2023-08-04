package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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


    //=======================US_44==============================

    @FindBy(xpath = "//img[@class='topuser-image']")
    public WebElement studentLoginProfileImage;

    @FindBy(xpath = "//*[text()=' Change Password']")
    public WebElement studentLoginProfileImageChangePasswordLink;

    @FindBy(xpath = "//a[text()='Change Password']")
    public WebElement studentLoginProfileImageChangePasswordText;

    @FindBy(xpath = "(//input[@class='form-control col-md-7 col-xs-12'])[1]")
    public WebElement studentLoginChangePasswordCurrentPasswordTextbox;

    @FindBy(xpath = "(//input[@class='form-control col-md-7 col-xs-12'])[2]")
    public WebElement studentLoginChangePasswordNewPasswordTextbox;

    @FindBy(xpath = "(//input[@class='form-control col-md-7 col-xs-12'])[3]")
    public WebElement studentLoginChangePasswordConfirmPasswordTextbox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement studentLoginChangePasswordSaveButton;

    @FindBy(xpath = "//div[@class='nav-tabs-custom theme-shadow']")
    public WebElement studentLoginChangePasswordPage;

    //======================US_47====================

    @FindBy(xpath = "//*[@class='content-wrapper']")
    public WebElement homeworkDetailsWindow;

    @FindBy(id ="assigment_message")
    public WebElement assignmentMessageTextbox;

    @FindBy(xpath = "(//*[@class='btn btn-default btn-xs'])[1]")
    public WebElement homeworkPageViewEditIcon;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement assignmentSaveButton;

    @FindBy(xpath = "(//*[@class='label label-warning'])[1]")
    public WebElement assignmentSubmittedAlert;

    @FindBy(xpath = "//*[@class='closed-exam']")
    public WebElement closedHomeworkHeadline;

    @FindBy(xpath = "//*[@class='content']")
    public WebElement closedHomeworkList;

    @FindBy(xpath = "(//*[@class='btn btn-default btn-xs'])[15]")
    public WebElement closedHomeworkViewEditIcon;

    @FindBy(xpath = "(//*[@class='label label-warning'])[9]")
    public WebElement closedHomeworkSubmittedLabel;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-primary']")
    public WebElement dailyAssignmentLinkButton;

    @FindBy(xpath = "//*[@class='box box-info']")
    public WebElement dailyAssignmentListPage;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-primary']")
    public WebElement addDailyAssignment;

    @FindBy(xpath = "(//*[@class='col-md-12'])[1]")
    public WebElement dailyAssignmentListColumns;

    @FindBy(xpath = "(//*[@class='label label-warning'])[1]")
    public WebElement upcominHomeworkSubmittedLabel;


    @FindBy(xpath = "//p[text()='The Message field is required.']")
    public WebElement homeworkDeleteWarningMessage;

    @FindBy(xpath = "//a[text()='Upcoming Homework']")
    public WebElement closedHomeworkMessageSuccessful;
    //-------------------------US48--------------------
    @FindBy(xpath = "//span[text()='Online Exam']")
    public WebElement onlineExamLink;

    @FindBy(xpath = "//a[text()='Upcoming Exams']")
    public WebElement upcomingExamsColumns_OnlineExam;


    @FindBy(xpath = "//a[text()='Closed Exam']")
    public WebElement closedExamColumns_OnlineExam;

    @FindBy(xpath = "(//i[@class='fa fa fa-eye'])[1]")
    public WebElement eyeImg_view_upcomingExam;

    @FindBy(xpath = "//h4[@class='text-center font-weight-bold']")
    public WebElement examTitle_view_upcomingExam;


    public void closedExamColumpVisibility(){
        List<WebElement> tableTitles=Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_1\"]/thead/tr/th"));

        for (WebElement element:tableTitles
        ) {
            Assert.assertTrue(element.isDisplayed());
        }
    }


}

