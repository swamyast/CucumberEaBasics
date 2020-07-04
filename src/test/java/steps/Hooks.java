package steps;

import base.BaseUtil;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseUtil{
    private BaseUtil base;
    public String ProjectPath=System.getProperty("user.dir");
    public Hooks(BaseUtil Base){
        this.base=Base;
    }
    @Before
    //Adding scenario argument for Extent reporting purpose
    public void setUp(Scenario scenario) {
        //Adding scenariodef argument for Extent reporting purpose
        scenarioDef=base.features.createNode(scenario.getName());
        System.out.println(ProjectPath);
        System.out.println("Initialize the browser----------------");
        System.setProperty("webdriver.gecko.driver",ProjectPath+"\\src\\test\\drivers\\geckodriver.exe");
        base.driver=new FirefoxDriver();
        base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /*@BeforeStep
    public void eachStep() {
        System.out.println("Before each step****************8");
    }
    @AfterStep
    public void eachStepAfter(){
        System.out.println("After each step *****************");
    }*/

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            System.out.println("Take screenshot");
        }
        System.out.println("Close the browser - - - - - - - --");
       base.driver.quit();
    }
}
