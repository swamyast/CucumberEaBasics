package steps;

import base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.List;

public class LoginSteps extends BaseUtil {
    public BaseUtil base;
    public LoginSteps(BaseUtil Base){
        this.base=Base;
    }
    LoginPage loginPage;
    @Given("I navigate to application$")
    public void navigateToApplication() {
        System.out.println("Navigate to app");
        base.driver.navigate().to("http://executeautomation.com/demosite/Login.html");
        base.driver.manage().window().maximize();

    }


    @When("I click on Signin button")
    public void signIn()  {
        loginPage=new LoginPage(base.driver);
        loginPage.signIn();
    }


    @Then("I should see home page")
    public void verifyHomePage() throws InterruptedException {
        Thread.sleep(6000);
        loginPage=new LoginPage(base.driver);
        boolean val=loginPage.verifyHomePage();
        if(val==true){
            System.out.println("Test successfully logged into app");
        }
    }

    @And("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String uname, String password) {
        loginPage=new LoginPage(base.driver);
        loginPage.loginApp(uname,password);
    }

    @And("I enter the following crenetials")
    public void iEnterTheFollowingCrenetials(DataTable table) {
        List<String> users=table.asList();
        loginPage=new LoginPage(base.driver);
        loginPage.loginApp(users.get(2),users.get(3));
    }
}
