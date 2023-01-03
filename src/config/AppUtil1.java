package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtil1 {
	public static WebDriver driver;
	@BeforeMethod
	public static void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Running pre-condition", true);
	}
	@AfterMethod
	public static void teardown()
	{
		Reporter.log("Running post-condition", true);
		driver.close();
	}
}
