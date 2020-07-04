package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.NAME,using="UserName")
    public WebElement txt_UserName;

    @FindBy(how=How.NAME,using="Password")
    public WebElement txt_Password;

    @FindBy(how=How.ID,using = "Initial")
    public WebElement txt_HomePageInitial;

    @FindBy(how=How.NAME,using = "Login")
    public WebElement btn_SignIn;

    public void loginApp(String userName,String Password){
        txt_UserName.sendKeys(userName);
        txt_Password.sendKeys(Password);
    }
    public void signIn(){
        btn_SignIn.submit();
    }
    public boolean verifyHomePage(){
        return txt_HomePageInitial.isDisplayed();
    }
}
