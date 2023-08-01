package stepdefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import pages.AdminPage;

import pages.TeacherPage;


import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import pages.LoginPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;


public class Admin {
    WebDriver driver = Driver.getDriver();
    TeacherPage tpage=new TeacherPage();
    AdminPage adminPage=new AdminPage();


    /*US_29 Admin*/
    @Given("{string} {string} login admin")
    public void Us_29(String email,String sifre)
    {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        tpage.Teacher_Button.click();
        ReusableMethods.bekle(1);
        System.out.println(driver.getTitle());
        ReusableMethods.switchToWindow("Login : Wonder World College");
        WebElement usertext = tpage.Teacher_UserNameTextbox;
        usertext.click();
        usertext.sendKeys(email);
        tpage.Teacher_PasswordTextbox.click();
        tpage.Teacher_PasswordTextbox.sendKeys(sifre);
        tpage.Teacher_Login_Button.click();

    }
    @Then("The Add complain window with Complain Type, Source dropdown menus and Phone, Date, Description, Action Taken, Assigned, Note textBoxes should be displayed on the Complain page")
    public void US_29_2()
    {
        ReusableMethods.switchToWindow("Wonder World College");
        adminPage.frontoffice.click();
        adminPage.frontoffice_Complain.click();
        List<WebElement> cardSidebarElements = driver.findElements(By.className("form-group"));
        int limit = Math.min(cardSidebarElements.size(), 11);
        for (int i = 0; i < limit; i++) {
            WebElement element = cardSidebarElements.get(i);
            String[] terms = element.getText().split("\\s+"); // Boşluklara göre veriyi böler
            if (terms.length > 0) {
                System.out.println(terms[0]); // Sadece ilk terimi yazdırır
            }
        }
    }
    @Then("It should be possible to upload the document related to the complaint in the Add complain window on the Complain page")
    public void US_29_03()
    {

        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

        // Dosya yolu belirt (örneğin, "C:\\Users\\kullanici_adi\\dosya.txt")
        String filePath = "C://Users//griff//Downloads//x.jpg";
        // JavaScript Executor kullanarak dosya yolu belirleme işlemini gerçekleştir
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys(filePath);
    }
    @Then("The Complain List with the titles Complain, Complain Type, Name, Phone, Date, Action should be displayed in the Complain List window")
    public void US_29_04()
    {

        System.out.println("-----------------------");
        List<WebElement> complainSidebarElements = driver.findElements(By.className("sorting"));
        int limit2 = Math.min(complainSidebarElements.size(), 6);
        for (int i = 0; i < limit2; i++) {
            WebElement element = complainSidebarElements.get(i);
            String[] terms = element.getText().split("\\s+"); // Boşluklara göre veriyi böler
            if (terms.length > 0) {
                System.out.println(terms[0]); // Sadece ilk terimi yazdırır
            }
        }
    }
    @Then("The details of the complaint should be displayed in the Edit Complain window opened by clicking the Edit icon under the Action title in the Complain List, it should be updated and saved with the save button")
    public void US_29_05()
    {
        WebElement ComplainBy = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/div[3]/input"));
        ComplainBy.click();
        ComplainBy.sendKeys("ss");
        scrollDown(driver,500);
        adminPage.savebutton.click();
        adminPage.complainsearch.click();
        adminPage.complainsearch.sendKeys("ss");
        ReusableMethods.bekle(2);
        adminPage.complainview.click();
        ReusableMethods.bekle(2);
        adminPage.complainview_close.click();
        adminPage.complainview_edit.click();
        ReusableMethods.bekle(5);
        WebElement complain = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/div[3]/input"));
        complain.click();
        complain.sendKeys("2");
        scrollDown(driver,500);
        WebElement save= driver.findElement(By.xpath("//*[@id=\"form1\"]/div[2]/button"));
        save.click();
        ReusableMethods.bekle(3);
        WebElement complaindelete=driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[3]"));
        complaindelete.click();
        Alert alert = driver.switchTo().alert();

        // Onay kutusunu kabul et (OK düğmesine tıkla)
        alert.accept();
        ReusableMethods.bekle(5);
    }
    /*US_29*/
    public static void scrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
    }

    @And("Page Closed US_29")
    public void close()
    {
        Driver.closeDriver();
    }





    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(driver);


    //__________________________US_022________________________________________

    @When("The user clicks on the admin login tab")
    public void the_user_clicks_on_the_admin_login_tab() {
        String WHD = driver.getWindowHandle();
        loginPage.adminLoginButton.click();
    }

    @When("The user navigates to a new page that opens in the browser")
    public void the_user_navigates_to_a_new_page_that_opens_in_the_browser() {
        ReusableMethods.switchToWindow("Login : Wonder World College");
        ReusableMethods.bekle(2);


    }

    @When("The user enters {string} into the username textbox")
    public void the_user_enters_into_the_username_textbox(String adminName) {
        loginPage.adminLoginUsernameTextbox.sendKeys(ConfigReader.getProperty(adminName));

    }

    @When("The user enters {string} into the password textbox")
    public void the_user_enters_admin_password_into_the_password_textbox(String adminPassword) {
        loginPage.adminLoginPasswordTextbox.sendKeys(ConfigReader.getProperty(adminPassword));

    }

    @When("The user clicks the Sign In button and goes to the admin page")
    public void the_user_clicks_the_sign_ın_button_and_goes_to_the_admin_page() {
        loginPage.adminLoginSignInButton.click();
        ReusableMethods.bekle(1);

    }

    @When("The user clicks on the Student Information link in the admin panel's sidebar")
    public void the_user_clicks_on_the_student_ınformation_link_in_the_admin_panel_s_sidebar() {
        adminPage.studentInformationLink.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user verifies that the dropdown menu displays the \"\"Multi Class Student\"\" link")
    public void the_user_verifies_that_the_dropdown_menu_displays_the_multi_class_student_link() {
        ;
        assertTrue(adminPage.multiClassStudentLink.isDisplayed());
    }

    @When("The user clicks on the Multi Class Student link in the opened dropdown menu")
    public void the_user_clicks_on_the_multi_class_student_link_in_the_opened_dropdown_menu() {
        adminPage.multiClassStudentLink.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user verifies that the opened page goes to the {string} address")
    public void the_user_verifies_that_the_opened_page_goes_to_the_address(String string) {
        String expectedUrl = "https://qa.wonderworldcollege.com/student/multiclass";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }


    @Then("The user verifies that the Class and Section textboxes are visible on the opened page")
    public void the_user_verifies_that_the_class_and_section_textboxes_are_visible_on_the_opened_page() {
      assertTrue(adminPage.classDropDowntBox_multiClassStudent.isDisplayed());
      assertTrue(adminPage.sectionDropDownBox_multiClassStudent.isDisplayed());

    }

    @Then("The user clicks on the Class textbox and selects the Class 2 tab from the opened dropdown menu")
    public void the_user_clicks_on_the_class_textbox_and_selects_the_class_tab_from_the_opened_dropdown_menu() {
        Select select=new Select(adminPage.classDropDowntBox_multiClassStudent);
        select.selectByIndex(2);
        ReusableMethods.bekle(1);

    }

    @Then("The user clicks on the Section textbox and selects the A tab from the opened dropdown menu")
    public void the_user_clicks_on_the_section_textbox_and_selects_the_a_tab_from_the_opened_dropdown_menu() {
        Select select=new Select(adminPage.sectionDropDownBox_multiClassStudent);
        select.selectByIndex(1);
        ReusableMethods.bekle(1);

    }

    @When("The user clicks Search button in Multi Class Student page")
    public void theUserClicksSearchButtonInMultiClassStudentPage() {
        adminPage.searchtButton_MultiClassStudent.click();

    }
    @And("The user verifies that the {string} heading is visible on the page that opens as a result of the search")
    public void theUserVerifiesThatTheHeadingIsVisibleOnThePageThatOpensAsAResultOfTheSearch(String arg0) {
       String expectesResult="Select Criteria";
       String actualResult=adminPage.selectCriteriaTitleText.getText();
       assertEquals(expectesResult,actualResult);
    }

    @When("The user clicks on the + icon in the student's window in the top-left corner")
    public void the_user_clicks_on_the_icon_in_the_student_s_window_in_the_top_left_corner() {
        adminPage.plusIconButton.click();
        ReusableMethods.bekle(3);

    }

    @Then("The user verifies that a new section has been added")
    public void the_user_verifies_that_a_new_section_has_been_added() {

        assertTrue(adminPage.classBox_ClassNewLine().isDisplayed());

    }

    @When("The user enters different class information in \"\"Class\"\" and \"\"Section\"\" constructors")
    public void the_user_enters_different_class_information_in_class_and_section_constructors() {
        Select select = new Select(adminPage.classBox_ClassNewLine());
        select.selectByIndex(3);
        ReusableMethods.bekle(1);

        select = new Select(adminPage.sectionBox_ClassNewLine());
        select.selectByIndex(1);
        ReusableMethods.bekle(1);


    }

    @When("The user clicks \"\"Update\"\"\" button")
    public void the_user_clicks_update_button() {
        adminPage.updateButton_multiClassStudent.click();
    }

    @Then("The user verifies that the class was added successfully.")
    public void the_user_verifies_that_the_class_was_added_successfully() {

        assertTrue(adminPage.recordSavedSuccesfullyText_MultiClass.isDisplayed());
    }
    @And("Kullanıcı sol üst köşede bulunan ögrenciye ait en altta bulunan sınıf bilgisini \"\"Remove\"\" butonuna tıklayarak siler.")
    public void kullanıcıSolÜstKöşedeBulunanÖgrenciyeAitEnAlttaBulunanSınıfBilgisiniRemoveButonunaTıklayarakSiler() {

        adminPage.removeButton_ClassNewLine().click();
    }




    //_________________________________________________________________________


    //=======================US_19==============================
    @Then("The user verifies that the admin panel s top bar has a visible profile icon")
    public void the_user_verifies_that_the_admin_panel_s_top_bar_has_a_visible_profile_icon() {
        Assert.assertTrue(adminPage.topBarAdminProfileIcon.isDisplayed());
    }

    @Then("The user clicks on the profile icon on the admin panels top bar.")
    public void the_user_clicks_on_the_profile_icon_on_the_admin_panels_top_bar() {
        adminPage.topBarAdminProfileIcon.click();
    }

    @Then("The user verifies that a window opens displaying the account owner's name, role, and links to Profile, Password, and Logout.\"")
    public void the_user_verifies_that_a_window_opens_displaying_the_account_owner_s_name_role_and_links_to_profile_password_and_logout() {
        Assert.assertTrue(adminPage.topBarAccountOwnersName.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersRole.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersProfileLink.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersPassword.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersLogout.isDisplayed());
    }

    @When("The user clicks on the profile link")
    public void the_user_clicks_on_the_profile_link() {
        adminPage.topBarAccountOwnersProfileLink.click();
    }

    @When("The user verifies that they are linked to the profile page")
    public void the_user_verifies_that_they_are_linked_to_the_profile_page() {
        Assert.assertTrue(adminPage.adminProfilePageBodyBox.isDisplayed());
    }

    @Then("The user verifies that there are  transitions to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information, Address Details, Bank Account Details, and Social Media Link information should be displayed.")
    public void the_user_verifies_that_there_are_transitions_to_the_profile_payroll_leaves_attendance_documents_pages_and_the_general_information_address_details_bank_account_details_and_social_media_link_information_should_be_displayed() {
        Assert.assertTrue(adminPage.adminProfilePageProfile.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePagePayroll.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageLeaves.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageAttendance.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageDocuments.isDisplayed());

        Assert.assertTrue(adminPage.adminProfilePageGeneralInfoWindow.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageAddressDetails.isDisplayed());
        Assert.assertTrue(adminPage.adminProfileBankAccountDetails.isDisplayed());
        Assert.assertTrue(adminPage.adminProfileSocialMediaLinkDetails.isDisplayed());

    }

    @When("The user clicks on the payroll link button")
    public void theUserClicksOnThePayrollLinkButton() {
        adminPage.adminProfilePagePayroll.click();
    }

    @Then("The user verifies that on the Payroll page info boards \\(Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) are visible.")
    public void theUserVerifiesThatOnThePayrollPageInfoBoardsTotalNetSalaryPaidTotalGrossSalaryTotalEarningTotalDeductionAreVisible() {
        Assert.assertTrue(adminPage.payrollTotalNetSalaryPaid.isDisplayed());
        Assert.assertTrue(adminPage.payrollTotalGrossSalary.isDisplayed());
        Assert.assertTrue(adminPage.payrollTotalEarning.isDisplayed());
        Assert.assertTrue(adminPage.payrollTotalDeduction.isDisplayed());
    }

    @Then("The user verifies that, on the Payroll page, the Payslip List are displayed with columns \\(Month-Year, Date, Mode, Status, Net Salary, Action).")
    public void theUserVerifiesThatOnThePayrollPageThePayslipListAreDisplayedWithColumnsMonthYearDateModeStatusNetSalaryAction() {
        Assert.assertTrue(adminPage.payrollPayslip.isDisplayed());
        Assert.assertTrue(adminPage.payrollMonthYear.isDisplayed());
        Assert.assertTrue(adminPage.payrollDate.isDisplayed());
        Assert.assertTrue(adminPage.payrollMode.isDisplayed());
        Assert.assertTrue(adminPage.payrollStatus.isDisplayed());
        Assert.assertTrue(adminPage.payrollNetSalary.isDisplayed());
        Assert.assertTrue(adminPage.payrollAction.isDisplayed());

    }

    @And("The user clicks on the View Payslip link under the Action column on the Payslip List")
    public void theUserClicksOnTheLinkUnderTheActionColumnOnThePayslipList() {
        adminPage.payrollViewPayslipButton.click();
    }

    @Then("The user verifies that, the corresponding payslip for that period is displayed.")
    public void theUserVerifiesThatTheCorrespondingPayslipForThatPeriodIsDisplayed() {
        Assert.assertTrue(adminPage.payrollPayslipDetails.isDisplayed());
    }

    @Then("The user verifies that,  the Payroll page has a search textBox for searching within the Paylist.")
    public void theUserVerifiesThatThePayrollPageHasASearchTextBoxForSearchingWithinThePaylist() {
        Assert.assertTrue(adminPage.payrollSearchBox.isDisplayed());
    }

    @Then("the user verifies that,  the Payroll page allows filtering within the Paylist using menu headings.")
    public void theUserVerifiesThatThePayrollPageAllowsFilteringWithinThePaylistUsingMenuHeadings() {
        Assert.assertTrue(adminPage.payrollPayslip.isEnabled());
        Assert.assertTrue(adminPage.payrollMonthYear.isEnabled());
        Assert.assertTrue(adminPage.payrollDate.isEnabled());
        Assert.assertTrue(adminPage.payrollMode.isEnabled());
        Assert.assertTrue(adminPage.payrollStatus.isEnabled());
        Assert.assertTrue(adminPage.payrollNetSalary.isEnabled());
    }

    @When("The user clicks on the Leaves link button")
    public void theUserClicksOnTheLeavesLinkButton() {
        adminPage.adminProfilePageLeaves.click();
    }

    @Then("The user verifies that,  on the Leaves page, the Leave List is displayed with columns \\(Leave Type, Leave Date, Days, Apply Date, Status, Action).")
    public void theUserVerifiesThatOnTheLeavesPageTheLeaveListIsDisplayedWithColumnsLeaveTypeLeaveDateDaysApplyDateStatusAction() {
        Assert.assertTrue(adminPage.leavesLeaveType.isDisplayed());
        Assert.assertTrue(adminPage.leavesLeaveDate.isDisplayed());
        Assert.assertTrue(adminPage.leavesDays.isDisplayed());
        Assert.assertTrue(adminPage.leavesApplyDate.isDisplayed());
        Assert.assertTrue(adminPage.leavesStatus.isDisplayed());
        Assert.assertTrue(adminPage.leavesAction.isDisplayed());
    }

    @And("The user clicks on the view icon on the Leaves page below the Action column")
    public void theUserClicksOnTheViewIconOnTheLeavesPageBelowTheActionColumn() {
        adminPage.leavesViewButton.click();

    }

    @Then("The user verifies that, the relevant leave information is displayed.")
    public void theUserVerifiesThatTheRelevantLeaveInformationIsDisplayed() {
        adminPage.leavesViewDetails.isDisplayed();
    }

    @When("The user clicks on the Attendance link button")
    public void theUserClicksOnTheAttendanceLinkButton() {
        adminPage.adminProfilePageAttendance.click();
    }

    @Then("The user verifies that on the Attendance page, info boards \\(Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) are visible.")
    public void theUserVerifiesThatOnTheAttendancePageInfoBoardsTotalPresentTotalLateTotalAbsentTotalHalfDayTotalHolidayAreVisible() {
        Assert.assertTrue(adminPage.attendanceTotalPresent.isDisplayed());
        Assert.assertTrue(adminPage.attendanceTotalLate.isDisplayed());
        Assert.assertTrue(adminPage.attendanceTotalAbsent.isDisplayed());
        Assert.assertTrue(adminPage.attendanceTotalHalfDay.isDisplayed());
        Assert.assertTrue(adminPage.attendanceTotalHoliday.isDisplayed());
    }

    @Then("The user verifies that on the Attendance page, a selectable attendance year is available.")
    public void theUserVerifiesThatOnTheAttendancePageASelectableAttendanceYearIsAvailable() {
        Assert.assertTrue(adminPage.selectableAttendanceYear.isEnabled());
    }

    @Then("The user verifies that, on the Attendance page, there is an explanation of the letters \\(P, L, A, F, H) used for attendance marking.")
    public void theUserVerifiesThatOnTheAttendancePageThereIsAnExplanationOfTheLettersPLAFHUsedForAttendanceMarking() {
        Assert.assertTrue(adminPage.attendanceExplanationOfTheLetters.isDisplayed());
    }

    @And("The user clicks on the columns icon")
    public void theUserClicksOnTheColumnsIcon() {
        adminPage.attendanceColumnsIcon.click();
    }

    @Then("The user verifies that, on the Attendance page, the Attendance List displays the staff's attendance for the selected month and days.")
    public void theUserVerifiesThatOnTheAttendancePageTheAttendanceListDisplaysTheStaffSAttendanceForTheSelectedMonthAndDays() {
        adminPage.attendanceDisplayOfSelectedDateMonth.isEnabled();

    }

    @And("The user clicks on the password link")
    public void theUserClicksOnThePasswordLink() {
        adminPage.topBarAccountOwnersPassword.click();
    }

    @Then("The user verifies that, the password link opens a page with Current Password, New Password, Confirm Password text boxes, and a Change Password button.")
    public void theUserVerifiesThatThePasswordLinkOpensAPageWithCurrentPasswordNewPasswordConfirmPasswordTextBoxesAndAChangePasswordButton() {
        Assert.assertTrue(adminPage.passwordChangeCurrentPasswordLine.isDisplayed());
        Assert.assertTrue(adminPage.passwordChangeNewPasswordLine.isDisplayed());
        Assert.assertTrue(adminPage.passwordChangeConfirmPasswordLine.isDisplayed());
        Assert.assertTrue(adminPage.passwordChangeChangePasswordButton.isDisplayed());
    }

    @And("The user enters valid values in the Current Password {string}, New Password {string}, and Confirm Password {string} text boxes")
    public void theUserEntersValidValuesInTheCurrentPasswordNewPasswordAndConfirmPasswordTextBoxes(String adminPassword, String newPassword, String newPasswordConfirm) {

        adminPage.passwordChangeCurrentPasswordTextbox.sendKeys(ConfigReader.getProperty(adminPassword));
        adminPage.passwordChangeNewPasswordTextbox.sendKeys(ConfigReader.getProperty(newPassword));
        adminPage.passwordChangeConfirmPasswordTextbox.sendKeys(ConfigReader.getProperty(newPasswordConfirm));
    }

    @And("The user clicks on the Change Password button.")
    public void theUserClicksOnTheChangePasswordButton() {

        adminPage.passwordChangeChangePasswordButton.click();
    }

    @Then("The user verifies that, the password is changed.")
    public void theUserVerifiesThatThePasswordIsChanged() {
        Assert.assertTrue(adminPage.passwordChangeSuccessfullyChangedMessage.isDisplayed());
    }

    @And("The user clicks on the Logout link")
    public void theUserClicksOnTheLogoutLink() {
        adminPage.topBarAccountOwnersLogout.click();
    }

    @Then("The user verifies that, clicking on the Logout link in the window that opens when clicking on the profile icon in the admin panel's top bar, the admin is logged out of the admin panel.")
    public void theUserVerifiesThatClickingOnTheLogoutLinkInTheWindowThatOpensWhenClickingOnTheProfileIconInTheAdminPanelSTopBarTheAdminIsLoggedOutOfTheAdminPanel() {
        Assert.assertTrue(adminPage.adminLoginPage.isDisplayed());
    }


    //=====================================================


    //======================= US_023 ==================================

    @When("The user clicks Admin Login button on wonder world college page")
    public void the_user_clicks_admin_login_button_on_wonder_world_college_page() {
        loginPage.adminLoginButton.click();
    }
    @When("The user enters valid username in Username textbox on Admin Login page")
    public void the_user_enters_valid_username_in_username_textbox_on_admin_login_page() {
        String firstWhd = Driver.getDriver().getWindowHandle();
        String secondsWhd = "";
        Set<String> whd = Driver.getDriver().getWindowHandles();
        for (String eachWhd:whd
             ) {
            if (!eachWhd.equals(firstWhd)) {
               secondsWhd=eachWhd;
            }
        }

        Driver.getDriver().switchTo().window(secondsWhd);

        loginPage.adminLoginUsernameTextbox.sendKeys(ConfigReader.getProperty("adminUsername_dln"));
    }
    @When("The user enters valid password in Password textbox on Admin Login page")
    public void the_user_enters_valid_password_in_password_textbox_on_admin_login_page() {
        loginPage.adminLoginPasswordTextbox.sendKeys(ConfigReader.getProperty("adminPassword_dln"));
    }
    @When("The user clicks Sing In buton")
    public void the_user_clicks_sing_in_buton() {
        loginPage.adminLoginSignInButton.click();
    }
    @When("The user clicks on the Student Information menu title in the sidebar in the admin panel")
    public void the_user_clicks_on_the_student_information_menu_title_in_the_sidebar_in_the_admin_panel() {
        adminPage.studentInformationButton.click();
    }
    @Then("The user verifies that the Student Detalis link is displayed in the drop-down menu")
    public void the_user_verifies_that_the_student_detalis_link_is_displayed_in_the_drop_down_menu() {
        assertTrue(adminPage.studentDetailsLink.isDisplayed());
    }
    @When("The user clicks on the Student Detalis link in the drop-down menu")
    public void the_user_clicks_on_the_student_detalis_link_in_the_drop_down_menu() {
        adminPage.studentDetailsLink.click();
    }
    @Then("The user verifies from the url she was redirected to the search page")
    public void the_user_verifies_from_the_url_she_was_redirected_to_the_search_page() {
        String expectedUrl = ConfigReader.getProperty("studentDetailsUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
    }

    @Then("The user verifies that Class dropdown in Select Criteria is visible")
    public void the_user_verifies_that_class_dropdown_in_select_criteria_is_visible() {
        assertTrue(adminPage.studentDetailsClassDropdown.isDisplayed());
    }
    @Then("The user verifies that Class dropdown in Select Criteria is active")
    public void the_user_verifies_that_class_dropdown_in_select_criteria_is_active() {
        assertTrue(adminPage.studentDetailsClassDropdown.isEnabled());
    }
    @Then("The user verifies that Section dropdown in Select Criteria is visible")
    public void the_user_verifies_that_section_dropdown_in_select_criteria_is_visible() {
        assertTrue(adminPage.studentDetailsSectionDropdown.isDisplayed());
    }
    @Then("The user verifies Section dropdown in Select Criteria is active")
    public void the_user_verifies_section_dropdown_in_select_criteria_is_active() {
        assertTrue(adminPage.studentDetailsSectionDropdown.isEnabled());
    }
    @Then("The user verifies that the Search By Keyword textbox in the Select Criteria section is visible")
    public void the_user_verifies_that_the_search_by_keyword_textbox_in_the_select_criteria_section_is_visible() {
        assertTrue(adminPage.studentDetailsSearchByKeywordTextbox.isDisplayed());
    }
    @Then("The user verifies that the Search By Keyword textbox in the Select Criteria section is active")
    public void the_user_verifies_that_the_search_by_keyword_textbox_in_the_select_criteria_section_is_active() {
        assertTrue(adminPage.studentDetailsSearchByKeywordTextbox.isEnabled());
    }
    @Then("The user verifies that the Search buttons in the Select Criteria section are visible")
    public void the_user_verifies_that_the_search_buttons_in_the_select_criteria_section_are_visible() {
        assertTrue(adminPage.studentDetailsFirstSearchButton.isDisplayed());
        assertTrue(adminPage.studentDetailsSecondSearchButton.isDisplayed());
    }
    @Then("The user verifies that the Search buttons in the Select Criteria section are active")
    public void the_user_verifies_that_the_search_buttons_in_the_select_criteria_section_are_active() {
        assertTrue(adminPage.studentDetailsFirstSearchButton.isEnabled());
        assertTrue(adminPage.studentDetailsSecondSearchButton.isEnabled());
    }


    //=========================================================

}
