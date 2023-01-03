package dec13;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertyfile {
	WebDriver driver;
	Properties p;
	@Test
	public void Login() throws Throwable
	{
		p= new Properties();
		p.load(new FileInputStream("C:\\SELENIUM\\TestNG_Framework\\Login.properties"));
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(p.getProperty("ObjUser"))).sendKeys(p.getProperty("EnterUser"));
		driver.findElement(By.xpath(p.getProperty("ObjPass"))).sendKeys(p.getProperty("EnterPassword"));
		driver.findElement(By.xpath(p.getProperty("objLogin"))).click();
	}

}
