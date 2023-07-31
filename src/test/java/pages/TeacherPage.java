package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

}
