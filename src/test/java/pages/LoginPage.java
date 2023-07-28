package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //======================ortak==============================

    // Wonder World College text on the Login page.
    @FindBy(xpath = "//h1[text()='Wonder World College']")
    public WebElement wonderWorldCollegeText;

    // Student login button on Login page.
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement studentLoginButton;

    // Parent login button on login page.
    @FindBy(xpath = "(//a[@target='_blank'])[2]")
    public WebElement parentLoginButton;

    // Admin login button on login page.
    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement adminLoginButton;

    // Teacher login button on login page.
    @FindBy(xpath = "(//a[@target='_blank'])[4]")
    public WebElement teacherLoginButton;

    // Front site button on login page.
    @FindBy(xpath = "(//a[@target='_blank'])[5]")
    public WebElement frontSiteButton;

    // User Login text on the User Login page.
    @FindBy(xpath = "//h3[text()='User Login']")
    public WebElement userLoginText;

    // Username textbox on the User Login page.
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userLoginUsernameTextbox;

    // Password textbox on the User Login page.
    @FindBy(xpath = "//input[@name='password']")
    public WebElement userLoginPasswordTextbox;

    // Sign In button on the User Login page.
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement userLoginSignInButton;

    // Forgot password link on User Login page.
    @FindBy(xpath = "//a[@class='forgot']")
    public WebElement userLoginForgotPasswordLink;

    // Front site link on User Login page.
    @FindBy(xpath = "//a[@class='forgot pull-right']")
    public WebElement userLoginSrontSiteLink;

    // Wonder World College logo on User Login and Admin Login page.
    @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/uploads/school_content/admin_logo/1.png']")
    public WebElement wonderWorldCollegeLogo;

    // Admin login text on Admin Login page.
    @FindBy(xpath = "//h3[text()='Admin Login']")
    public WebElement adminLoginText;

    // Username textbox on Admin Login page.
    @FindBy(xpath = "//input[@name='username']")
    public WebElement adminLoginUsernameTextbox;

    // Password textbox on Admin Login page.
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminLoginPasswordTextbox;

    // Sign In button on Admin Login page.
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginSignInButton;

    // Forgot password link on Admin Login page.
    @FindBy(xpath = "//a[@class='forgot']")
    public WebElement adminLoginForgotPasswordLink;

    // Front Site link on Admin Login page.
    @FindBy(xpath = "(//a[@target='_blank'])[2]")
    public WebElement adminLoginFrontSiteLink;

    // User Login link on Admin Login page.
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement adminLoginUserLoginLink;

}
