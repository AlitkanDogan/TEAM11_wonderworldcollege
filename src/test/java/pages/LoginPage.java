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
    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminLoginUsernameTextbox;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement parentLoginUsernameTextbox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement parentLoginPasswordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement parentLoginSignInButton;


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

    //WonderWorldCollege homepage Login button Student/Parent
    @FindBy(xpath ="//*[@class='complainbtn']")
    public WebElement loginButtonStudentParent;

    //WonderWorldCollege userlogin page student-parent
    @FindBy(xpath = "//*[@class='loginbg']")
    public WebElement userLoginPageStudentParent;

    @FindBy(xpath = "//*[@class = ' bg-shadow-remove ']")
    public WebElement whatsNewInWonderWorldCollege;

    @FindBy(id ="email")
    public  WebElement userNameTextbox;

    @FindBy(id ="password")
    public  WebElement passwordTextbox;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement signInButtonUserLogin;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public WebElement invalidUsernameOrPasswordAlert;

    @FindBy(xpath = "//*[@class='forgot']")
    public  WebElement forgotPasswordLinkStudentParent;

    @FindBy(xpath = "//*[text()='Forgot Password']")
    public  WebElement ufPasswordPageStudentParent;

    @FindBy(id="form-username")
    public  WebElement resetPasswordEmailTextbox;

    @FindBy(xpath = "(//*[@class='radio-inline'])[1]")
    public  WebElement resetPasswordEmailRadioButton;

    @FindBy(xpath = "//*[@class='btn']")
    public  WebElement resetEmailSubmitButton;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public  WebElement resetEmailSendingFailAlert;

    @FindBy(xpath = "//*[@class='forgot']")
    public  WebElement ufpasswordPageUserLoginLink;

    @FindBy(xpath = "//*[@class='forgot pull-right']")
    public  WebElement frontSiteLink;

    @FindBy(xpath = "//*[@class='list-item col-md-3 col-md-offset-2']")
    public  WebElement mainLoginPage;

    @FindBy(xpath = "//*[@class='bgoffsetbg']")
    public  WebElement adminLoginPage;

    //----------------------us43-------------------
    @FindBy(xpath = "//div[text()='Invalid Username Or Password']")
    public WebElement invalidUsernameOrPassword_Text;

    @FindBy(xpath = "//h3[text()='Forgot Password']")
    public WebElement forgotPaswordPageTitle;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox_forgotPasswordPage;

    @FindBy(xpath = "(//input[@name='user[]'])[1]")
    public WebElement studentRadioButton_forgotPasswordPage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton_forgotPasswordPage;

    @FindBy(xpath = "//div[text()='Email sending failed. Please try again.']")
    public WebElement emailSendingFailedText;

    @FindBy(xpath = "//*[@name = 'username']")
    public WebElement teacherUsernameTextbox;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement adminNameBox;



}


