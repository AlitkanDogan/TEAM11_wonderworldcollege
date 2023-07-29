package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {

    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@class='dropdown-toggle'])[2]")
    public WebElement topBarAdminProfileIcon;

    @FindBy(xpath = "//*[@class='text-capitalize']")
    public WebElement topBarAccountOwnersName;

    @FindBy(xpath = "(//*[text()='Admin'])[1]")
    public WebElement topBarAccountOwnersRole;

    @FindBy(xpath = "//*[@data-original-title= 'My Profile']")
    public WebElement topBarAccountOwnersProfileLink;

    @FindBy(xpath = "//*[@data-original-title= 'Change Password']")
    public WebElement topBarAccountOwnersPassword;

    @FindBy(xpath = "//*[@href='https://qa.wonderworldcollege.com/site/logout']")
    public WebElement topBarAccountOwnersLogout;

    @FindBy(xpath = "//*[@class='box-body box-profile']")
    public WebElement adminProfilePageBodyBox;

    @FindBy(xpath = "//a[@href='#activity'] ")
    public WebElement adminProfilePageProfile;

    @FindBy(xpath = "//*[@href='#payroll']")
    public WebElement adminProfilePagePayroll;

    @FindBy(xpath = "//*[@href='#leaves']")
    public WebElement adminProfilePageLeaves;

    @FindBy(xpath = "//*[@href='#attendance']")
    public WebElement adminProfilePageAttendance;

    @FindBy(xpath = "//*[@href='#documents']")
    public WebElement adminProfilePageDocuments;

    @FindBy(xpath = "(//div[@class='tab-content'])[2]")
    public WebElement adminProfilePageGeneralInfoWindow;

    @FindBy(xpath = "(//div[@class='tshadow mb25 bozero'])[2]")
    public WebElement adminProfilePageAddressDetails;

    @FindBy(xpath = "(//div[@class='tshadow mb25 bozero'])[3]")
    public WebElement adminProfileBankAccountDetails;

    @FindBy(xpath = "(//div[@class='tshadow mb25  bozero'])")
    public WebElement adminProfileSocialMediaLinkDetails;


}
