package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Teacher {
    WebDriver driver = Driver.getDriver();

    TeacherPage tpage=new TeacherPage();
    /*US_37 Teacher*/
    @Given("login_teacher {string} {string}")
    public void human_resource(String mail,String password)
    {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        tpage.TeacherLogin.click();
        ReusableMethods.bekle(1);
        System.out.println(driver.getTitle());
        ReusableMethods.switchToWindow("Login : Wonder World College");
        WebElement usertext = tpage.Teacher_UserNameTextbox;
        usertext.click();
        usertext.sendKeys(mail);
        tpage.Teacher_PasswordTextbox.click();
        tpage.Teacher_PasswordTextbox.sendKeys(password);
        tpage.Teacher_Login_Button.click();
        ReusableMethods.switchToWindow("Wonder World College");
        tpage.human_resource.click();
        tpage.human_resource_applyleave.click();
        ReusableMethods.bekle(2);
        tpage.human_resource_applyleave_button.click();
        ReusableMethods.bekle(2);
        tpage.LeaveFromDate.click();
        tpage.LeaveFromDate_9.click();
        tpage.LeaveToDate.click();
        tpage.LeaveToDate_10.click();
        tpage.Reason.click();
        tpage.Reason.sendKeys("Hamza");
        ReusableMethods.bekle(2);
        tpage.submit.click();
        ReusableMethods.bekle(1);
        System.out.println(tpage.error.getText());

    }
    /* US_41 Teacher*/
    @Given("User goes to url")
    public void user_goes_to_url()
    {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
    }
    @Then("{string} {string} login teacher")
    public void email_password(String email,String sifre)
    {
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
    @Then("Quicks Links text and Quicks Links icon should be visible on the sidebar on the teacher panel.")
    public void quicks_link()
    {
        ReusableMethods.switchToWindow("Wonder World College");
        tpage.Teacher_Quick_Links.click();
        List<WebElement> cardSidebarElements = driver.findElements(By.className("card-sidebar"));
        int limit = Math.min(cardSidebarElements.size(), 10);
        for (int i = 0; i < limit; i++) {
            WebElement element = cardSidebarElements.get(i);
            String[] terms = element.getText().split("\\s+"); // Boşluklara göre veriyi böler
            if (terms.length > 0) {
                System.out.println(terms[0]); // Sadece ilk terimi yazdırır
            }
        }
    }


    @And("Page Closed")
    public void close()
    {
        Driver.closeDriver();
    }
}
