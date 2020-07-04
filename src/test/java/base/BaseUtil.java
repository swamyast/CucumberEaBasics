package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class BaseUtil {
    public WebDriver driver;
    public static ExtentReports extentReports;
    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public static String ReportLocation=System.getProperty("user.dir")+"/reports";
}
