package pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

