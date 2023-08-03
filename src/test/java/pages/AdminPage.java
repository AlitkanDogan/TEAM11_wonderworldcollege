package pages;


import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class AdminPage {
    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //========================Hamza=================================
    //Admin Page Front Office
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/a/span")
    public WebElement frontoffice;
    //Admin Page Front Office -> Complain
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/ul/li[6]/a")
    public WebElement frontoffice_Complain;
    //Admin Page Front Office -> Complain -> Save Button
    @FindBy(xpath = "//*[@id=\"submitbtn\"]")
    public WebElement savebutton;
    //Admin Page Front Office -> Complain -> Save Button -> Complain Search
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
    public WebElement complainsearch;
    //Admin Page Front Office -> Complain -> Save Button -> Complain Search -> View
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[1]/i")
    public WebElement complainview;
    //Admin Page Front Office -> Complain -> Save Button -> Complain Search -> View -> Close
    @FindBy(xpath = "//*[@id=\"complaintdetails\"]/div/div/div[1]/button")
    public WebElement complainview_close;
    //Admin Page Front Office -> Complain -> Save Button -> Complain Search -> View -> Close -> Edit
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[2]/i")
    public WebElement complainview_edit;






    @FindBy(xpath = "//span[text()='Student Information']")
    public WebElement studentInformationLink;

    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/student/multiclass'])[2]")
    public WebElement multiClassStudentLink;

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDowntBox_multiClassStudent;

    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDownBox_multiClassStudent;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm pull-right']")
    public WebElement searchtButton_MultiClassStudent;


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

    @FindBy(xpath = "(//*[@class='sorting'])[1]")
    public WebElement leavesLeaveType;

    @FindBy(xpath = "(//*[@class='sorting'])[2]")
    public WebElement leavesLeaveDate;

    @FindBy(xpath = "(//*[@class='sorting'])[3]")
    public WebElement leavesDays;

    @FindBy(xpath = "(//*[@class='sorting'])[4]")
    public WebElement leavesApplyDate;

    @FindBy(xpath = "(//*[@class='sorting'])[5]")
    public WebElement leavesStatus;

    @FindBy(xpath = "(//*[@class='text-right noExport sorting'])[2]")
    public WebElement leavesAction;

    @FindBy(xpath = "(//*[@class='fa fa-eye'])[1]")
    public WebElement leavesViewButton;

    @FindBy(xpath = "(//*[@class='modal-content'])[1]")
    public WebElement leavesViewDetails;

    @FindBy(xpath = "(//div[@class='staffprofile'])[5]")
    public WebElement attendanceTotalPresent;

    @FindBy(xpath = "(//div[@class='staffprofile'])[6]")
    public WebElement attendanceTotalLate;

    @FindBy(xpath = "(//div[@class='staffprofile'])[7]")
    public WebElement attendanceTotalAbsent;

    @FindBy(xpath = "(//div[@class='staffprofile'])[8]")
    public WebElement attendanceTotalHalfDay;

    @FindBy(xpath = "(//div[@class='staffprofile'])[9]")
    public WebElement attendanceTotalHoliday;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement selectableAttendanceYear;

    @FindBy(xpath = "//*[@class='halfday pull-right']")
    public WebElement attendanceExplanationOfTheLetters;

    @FindBy(xpath = "(//*[@class='fa fa-columns'])[2]")
    public WebElement attendanceColumnsIcon;

    @FindBy(xpath = "//*[@class='dt-button-collection']")
    public WebElement attendanceDisplayOfSelectedDateMonth;

    @FindBy(xpath = "(//*[@class='form-group'])[1]")
    public WebElement passwordChangeCurrentPasswordLine;

    @FindBy(xpath = "(//*[@class='form-group'])[2]")
    public WebElement passwordChangeNewPasswordLine;

    @FindBy(xpath = "(//*[@class='form-group'])[3]")
    public WebElement passwordChangeConfirmPasswordLine;

    @FindBy(xpath = "(//*[@class='btn btn-info'])[1]")
    public WebElement passwordChangeChangePasswordButton;

    @FindBy(xpath = "(//*[@class='form-control col-md-7 col-xs-12'])[1]")
    public WebElement passwordChangeCurrentPasswordTextbox;

    @FindBy(xpath = "(//*[@class='form-control col-md-7 col-xs-12'])[2]")
    public WebElement passwordChangeNewPasswordTextbox;

    @FindBy(xpath = "(//*[@class='form-control col-md-7 col-xs-12'])[3]")
    public WebElement passwordChangeConfirmPasswordTextbox;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement passwordChangeSuccessfullyChangedMessage;

    @FindBy(xpath = "//*[@class='bgoffsetbg']")
    public WebElement adminLoginPage;

    @FindBy(xpath = "(//h3[@class=\"box-title\"])[2]")
    public WebElement selectCriteriaTitleText;

    
    @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement plusIconButton;

    @FindBy(xpath = "//form[1]/div/div/div[2]/div/div/button")
    public WebElement updateButton_multiClassStudent;

    @FindBy(xpath = "//div[text()='Record Saved Successfully'] ")
    public WebElement recordSavedSuccesfullyText_MultiClass;


    //=============================us22 methods================================================
    public WebElement classBox_ClassNewLine() {
        List<WebElement> classElementsList = Driver.getDriver().findElements(By.xpath("//form[1]/div/div/div[1]/div[2]/div"));
        int size = classElementsList.size();
        String locate = "(//select[@name='class_id_" + size + "'])[1]";
        WebElement classBox = Driver.getDriver().findElement(By.xpath(locate));
        return classBox;
    }

    public WebElement sectionBox_ClassNewLine() {
        List<WebElement> classElementsList = Driver.getDriver().findElements(By.xpath("//form[1]/div/div/div[1]/div[2]/div"));
        int size = classElementsList.size();
        String locate = "(//select[@name='section_id_" + size + "'])[1]";
        WebElement classBox = Driver.getDriver().findElement(By.xpath(locate));
        return classBox;
    }

    public WebElement removeButton_ClassNewLine() {
        List<WebElement> classElementsList = Driver.getDriver().findElements(By.xpath("//form[1]/div/div/div[1]/div[2]/div"));
        int actualSize = classElementsList.size();
        String locate = "//form[1]/div/div/div[1]/div[2]/div[" + actualSize + "]/div[3]";
        WebElement classBox = Driver.getDriver().findElement(By.xpath(locate));
        return classBox;
    }
//===============================================================================



    @FindBy(xpath = "//span[text()='Fees Collection']")
    public WebElement feesCollectionClick;

    @FindBy(xpath = "(//*[text()='Fees Master'])[2]")
    public  WebElement feesMasterClicl;
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement addFeesMaster;
    @FindBy(xpath = "//select[@id='fee_groups_id']")
    public WebElement feesGroup;

    @FindBy(xpath = "//select[@id='feetype_id']")
    public WebElement feesType;

    @FindBy(xpath = "//input[@id='due_date']")
    public WebElement dueDate;
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amount;

    @FindBy(xpath = "(//input[@name='account_type'])[1]")
    public  WebElement FineTypeNone;

    @FindBy(xpath = "(//input[@name='account_type'])[2]")
    public  WebElement percentageButon;

    @FindBy(xpath = "(//input[@name='account_type'])[3]")
    public WebElement fixAmount;

    @FindBy(xpath = "//input[@id='fine_percentage']")
    public WebElement finePencere;

    @FindBy(xpath = "//input[@id='fine_amount']")
    public WebElement fineAmount;


    @FindBy(xpath = "(//th[@class='sorting'])[1]")
    public WebElement feesGroupList;

    @FindBy(xpath = "(//div[@class='col-md-6'])[3]") // (//div[@class="col-md-6"])[3]
    public WebElement feesCodeList;

    @FindBy(xpath = "(//div[@class='col-md-6'])[4]")
    public WebElement amountList;

    @FindBy(xpath = "//*[@class='text-right noExport sorting']")
    public WebElement actionList;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchboxList;

    @FindBy(xpath = "//select[@name='fee_groups_id']")
    public WebElement dropdownMenuElementi;
    @FindBy(xpath = "//select[@name='feetype_id']")
    public WebElement dropDowntBoxFeetype;
   @FindBy(xpath = "(//tbody/tr/td)[10]")
   public  WebElement date;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement addFeesMasterSave;
    @FindBy(xpath = "//div[text()='Record Saved Successfully']")
    public WebElement addFeesRecordSaved;


    @FindBy(xpath = "(//i[@class='fa fa-pencil'])[5]")
    public WebElement feesMasterListEdit;
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement editFeesMaster;
    @FindBy(xpath = "//div[text()='Record Updated Successfully']")
    public WebElement editRecord;

    @FindBy(xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement feesMasterListDelete;

    @FindBy(xpath = "//span[text()='Transport']")
    public WebElement transport;

    @FindBy(xpath = "(//*[text()='Routes'])[2]")
    public WebElement routesClick;
    @FindBy(xpath = "(//*[text()='Create Route'])")
    public WebElement createRoute;


    @FindBy(xpath = "//input[@id=\"route_title\"]")
    public WebElement Route_Title;

    @FindBy(xpath = "(//button[@type=\"submit\"])[3]")
    public WebElement saveRoute;

  @FindBy(xpath = "//div[text()='Record Saved Successfully']")
    public WebElement RecordSaved;

  @FindBy(xpath = "//h3[@class=\"box-title titlefix\"]")
  public WebElement routeList;

  @FindBy(xpath = "//th[@class=\"sorting_desc\"]")
  public  WebElement routeTitle;

  @FindBy(xpath = "//th[@class=\"text-right noExport sorting\"]")
  public WebElement routeAction;
  @FindBy(xpath = "(//i[@class='fa fa-pencil'])[2]")
  public WebElement routeEdit;

    @FindBy(xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement routeDelete;


    /*
    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div/label")
    public WebElement Route_Title;
    //Admin->login button->submit button -> Transport ->Routes ->Route_Title_TextBox
    @FindBy(xpath = "//*[@id=\"route_title\"]")
    public WebElement Route_Title_TextBox;
    //Admin->login button->submit button -> Transport ->Routes ->Route_Title_Save
    @FindBy(xpath = "//*[@id=\"form1\"]/div[2]/button")
    public WebElement Route_Title_Save;
    //Admin->login button->submit button -> Transport ->Routes ->RouteList_h1
    @FindBy(xpath = "//*[@id=\"route\"]/div[1]/h3")
    public WebElement RouteList_h1;
    //Admin->login button->submit button -> Transport ->Routes ->Route_Title_DropDown
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement Route_Title_DropDown;
    //Admin->login button->submit button -> Transport ->Routes ->Action
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement Action;
    //Admin->login button->submit button -> Transport ->Routes ->Search
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
    public WebElement Search;
    //Admin->login button->submit button -> Transport ->Routes ->Remove
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]/a[2]/i")
    public WebElement remove;

     */
}


