package runner;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

//@RunWith(Cucumber.class)// this is for JUnit
@Listeners(runner.TestListener.class)
@CucumberOptions(features = {"src/test/java/Features"},
        glue="steps",
        plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json"},
        dryRun = false, //this should set to true while checking mapping scenario with step definition.
        monochrome = true, // dsiplay console in proper readable format
        strict = true // check for missing step definition in steps class
        //tags={"@Regression"}
        )
public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios(){
                return super.scenarios();
        }
}
