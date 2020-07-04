package runner;

import base.ExtentReportUtil;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import static base.BaseUtil.features;
import base.BaseUtil.*;

public class TestListener implements ITestListener {

    ExtentReportUtil extentReportUtil=new ExtentReportUtil();
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("The test is starting "+iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("The Test is scuccessful "+iTestResult.getName());
        System.out.println(iTestResult.getMethod()+"  "+iTestResult.getStatus());
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("On test failure");
        try
        {
            extentReportUtil.screenShot();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        extentReportUtil.extentReport();
        features=extentReportUtil.extentReports.createTest(Feature.class,"Login Feature");
    }

    public void onFinish(ITestContext iTestContext) {
        extentReportUtil.reportFlush();
    }
}
