package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExtentReportUtil extends BaseUtil {
    public String FileName=ReportLocation+"extent.html";
    public void extentReport(){
        extentReports=new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter=new ExtentHtmlReporter(FileName);
        extentHtmlReporter.config().setTheme(Theme.DARK);
        extentHtmlReporter.config().setDocumentTitle("Test Report for Cucumber");
        extentHtmlReporter.config().setReportName("BDD report");
        extentHtmlReporter.config().setEncoding("utf-8");
        extentReports.attachReporter(extentHtmlReporter);
    }
    public void screenShot() throws IOException {
        File fil=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(fil.toPath(),new File(ReportLocation+"image.png").toPath());
    }
    public void reportFlush(){
        extentReports.flush();
    }
}
