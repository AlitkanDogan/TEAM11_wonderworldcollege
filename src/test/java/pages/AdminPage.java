package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}
