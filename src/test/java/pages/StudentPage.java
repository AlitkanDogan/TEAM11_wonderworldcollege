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






    //=====================================================
}

