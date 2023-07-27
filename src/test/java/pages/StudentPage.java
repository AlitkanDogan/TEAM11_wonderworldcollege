package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;
import utilities.Driver;

public class StudentPage {

    public StudentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//*[@class='complainbtn']")
    public WebElement loginButtonStudent;

    @FindBy(xpath = "//*[@class='loginbg']")
    public WebElement userLoginPage;
}
