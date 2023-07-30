package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;

public class Admin {

    AdminPage adminPage = new AdminPage();

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
        Assert.assertTrue(adminPage.passwordChangeButtonChangePasswordLine.isDisplayed());
    }


    //=====================================================
}
