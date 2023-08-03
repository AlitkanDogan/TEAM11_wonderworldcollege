package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ParentPage {

    //========================Hamza=================================
    public ParentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Parent Button
    @FindBy(className = "material-icons")
    public WebElement parent_button;
    //Parent UserNameTextBox
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement parent_usernametextbox;
    //Parent PasswordTextBox
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement parent_passwordtextbox;
    //Parent Submit Button
    @FindBy(className = "btn")
    public WebElement submit;
    //Parent Forgot Password
    @FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div[2]/p[3]/a")
    public WebElement forgotpassword;
    //Parent Invalid Username Or Password
    @FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div[2]/div")
    public WebElement Invalid_Username_Or_Password;
    //Forgot Password Page <h1>
    @FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div[2]/h3")
    public WebElement forgotpasswordpage;

    @FindBy(xpath = "//*[text()='Parent Login']")
    public  WebElement parentClick;
    @FindBy(xpath = "//img[@class=\"topuser-image\"]")
    public WebElement imageClick;

    @FindBy(xpath = "//a[text()=' Şifre değiştir']")
    public WebElement changePassword;
    @FindBy(xpath = "//*[text()='Kullanıcı adını değiştir']")
    public WebElement changeUsername;


    @FindBy(xpath = "//input[@name=\"current_username\"]")
    public WebElement CurrentUserName;
    @FindBy(xpath = "(//input[@required=\"required\"])[2]")
    public WebElement newUserName;
    @FindBy(xpath = "//input[@id=\"confirm_username\"]")
    public WebElement userNameConfirm;
    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement parentSubmit;


}


