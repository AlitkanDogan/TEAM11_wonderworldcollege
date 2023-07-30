package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {

    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Student Information']")
    public WebElement studentInformationLink;

    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/student/multiclass'])[2]")
    public WebElement multiClassStudentLink;

    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classTextBox_multiClassStudent;

    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionTextBox_multiClassStudent;

@FindBy(xpath = "//option[text()='Class 2']")
    public WebElement class2DropDown_ClassTextBox;

@FindBy(xpath = "//option[text()='Class 'A']")
    public WebElement A_DropDown_ClassTextBox;

@FindBy(xpath = "//button[@class='btn btn-primary btn-sm pull-right']")
    public WebElement selectButton_MultiClassStudent;


}
