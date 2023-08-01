package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ParentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Parent {
    WebDriver driver = Driver.getDriver();
    ParentPage parentPage =new ParentPage();


    /*US_53 Parent*/
    @Given("The user should be able to enter username and password in the relevant box")
    public void parent_button()
    {
        System.out.println("--------------------------");
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        parentPage.parent_button.click();
        System.out.println(parentPage.parent_button.isDisplayed());
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("Login : Wonder World College");
        WebElement usertextbox = parentPage.parent_usernametextbox;
        System.out.println(usertextbox.isDisplayed());
        usertextbox.click();
        usertextbox.sendKeys("dasda");
        WebElement passwordtextbox = parentPage.parent_passwordtextbox;
        System.out.println(passwordtextbox.isDisplayed());
        passwordtextbox.click();
        passwordtextbox.sendKeys("1231241243");
        parentPage.submit.click();

    }
    @Then("If the user logs in with the wrong data, they should see the warning message The username or password incorrect")
    public void US_53_02()
    {
        System.out.println(parentPage.Invalid_Username_Or_Password.isDisplayed());
        ReusableMethods.bekle(2);
        parentPage.forgotpassword.click();
        ReusableMethods.switchToWindow("Wonder World College");
        System.out.println(parentPage.forgotpasswordpage.isDisplayed());
        System.out.println(parentPage.forgotpasswordpage.getText());
    }
    @And("Page Closed US_53")
    public void close()
    {
        Driver.closeDriver();
    }
}
