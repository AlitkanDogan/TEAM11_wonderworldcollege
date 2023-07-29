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

    @FindBy(xpath = "(//div[@class='staffprofile'])[1]")
    public WebElement payrollTotalNetSalaryPaid;

    @FindBy(xpath = "(//div[@class='staffprofile'])[2]")
    public WebElement payrollTotalGrossSalary;

    @FindBy(xpath = "(//div[@class='staffprofile'])[3]")
    public WebElement payrollTotalEarning;

    @FindBy(xpath = "(//div[@class='staffprofile'])[4]")
    public WebElement payrollTotalDeduction;

    @FindBy(xpath = "(//*[@class='text text-left sorting'])[1]")
    public WebElement payrollPayslip;

    @FindBy(xpath = "(//*[@class='text text-left sorting'])[2]")
    public WebElement payrollMonthYear;

    @FindBy(xpath = "(//*[@class='text text-left sorting'])[3]")
    public WebElement payrollDate;

    @FindBy(xpath = "(//*[@class='text text-left sorting'])[4]")
    public WebElement payrollMode;

    @FindBy(xpath = "(//*[@class='text text-left sorting'])[5]")
    public WebElement payrollStatus;

    @FindBy(xpath = "(//*[@class='text text-right sorting'])")
    public WebElement payrollNetSalary;

    @FindBy(xpath = "(//*[@class='text-right noExport sorting'])")
    public WebElement payrollAction;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-xs checkbox-toggle edit_setting'])[1]")
    public WebElement payrollViewPayslipButton;

    @FindBy(id = "html-2-pdfwrapper")
    public WebElement payrollPayslipDetails;

    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement payrollSearchBox;




}
