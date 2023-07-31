package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import pages.AdminPage;
import pages.HomePage;
import pages.ParentPage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
}
