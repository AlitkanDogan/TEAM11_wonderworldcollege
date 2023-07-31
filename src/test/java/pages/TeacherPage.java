package pages;

<<<<<<< HEAD

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
>>>>>>> Dogan
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //---------------------------US32--------------------------------
    @FindBy(xpath = "//span[text()='Examinations']")
    public WebElement examinationsLink;

    @FindBy(xpath = "(//a[text()='Exam Group'])[2]")
    public WebElement examGroupLink;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox_examGroup;


    @FindBy(xpath = "//select[@id='name']")
    public WebElement ExamTypeDropdown_examGroup;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionBox_examGroup;

    @FindBy(xpath = "(//button[text()='Save'])[1]")
    public WebElement saveButton_examGroup;

    @FindBy(xpath = "//div[text()='Record Saved Successfully']")
    public WebElement recordSavedSuccessfulyText;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox_examGroupList;

    @FindBy(xpath = "(//a[@class='detail_popover'])[1]")
    public WebElement nameFirstBox_examGroupList;

    @FindBy(xpath = "(//th[@class='sorting'])[1]")
    public WebElement nameText_examGroupList;

    @FindBy(xpath = "(//th[@class='sorting'])[3]")
    public WebElement noOfExamText_examGroupList;

    @FindBy(xpath = "(//th[@class='sorting'])[2]")
    public WebElement examTypeText_examGroupList;

   @FindBy(xpath = "//th[@class='text-right noExport sorting']")
    public WebElement actionText_examGroupList;

   @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement plusButton_Action_examGroupList;

   @FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement editButton_Action_examGroupList;

   @FindBy(xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement deleteButton_Action_examGroupList;

   @FindBy(xpath = "//h3[@class='box-title titlefix']")
    public WebElement examListTitle_inPlusButton_examGroupList;



    //---------------------------------------------------------


    //========================Hamza=================================
    //WonderWorldCollege Teacher button
    @FindBy(xpath = "//li[4]/a/i")
    public WebElement Teacher_Button;
    //WonderWorld College Teacher login panel username text box
    @FindBy(xpath = "/html/body/div/div/section/div/div[2]/div/ul/li[4]/a")
    public WebElement TeacherLogin;
    @FindBy(xpath = "//*[@id=\"form-username\"]")
    public WebElement Teacher_UserNameTextbox;
    //WonderWorld College Teacher login panel Password text box
    @FindBy(id = "form-password")
    public WebElement Teacher_PasswordTextbox;
    //WonderWorld College Teacher login button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Teacher_Login_Button;
    //WonderWorld College Teacher Quick Links
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[1]/li[2]/a/span")
    public WebElement Teacher_Quick_Links;
    //WonderWorld College Teacher -> Quick Links -> Human Resource
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[6]/a/span")
    public WebElement human_resource;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[6]/ul/li[2]/a")
    public WebElement human_resource_applyleave;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/div/small/a")
    public WebElement human_resource_applyleave_button;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Leave From Date
    @FindBy(xpath = "//*[@id=\"leave_from_date\"]")
    public WebElement LeaveFromDate;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Leave From Date 9
    @FindBy(xpath = "/html/body/div[6]/div[1]/table/tbody/tr[2]/td[7]")
    public WebElement LeaveFromDate_9;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Leave To Date
    @FindBy(xpath = "//*[@id=\"leave_to_date\"]")
    public WebElement LeaveToDate;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Leave To Date 10
    @FindBy(xpath = "/html/body/div[6]/div[1]/table/tbody/tr[3]/td[1]")
    public WebElement LeaveToDate_10;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Reason
    @FindBy(xpath = "//*[@id=\"reason\"]")
    public WebElement Reason;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Submit
    @FindBy(xpath = "//*[@id=\"submitbtn\"]")
    public WebElement submit;
    //WonderWorld College Teacher -> Quick Links -> Human Resource -> Apply Leave -> Button -> Submit -> Error Message
    @FindBy(xpath = "//*[@id=\"toast-container\"]")
    public WebElement error;
}
