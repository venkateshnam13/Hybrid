package dec8;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil;

public class FirstTestNGclass extends AppUtil {
	@Test
	public void Branches() throws Throwable
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(3000);
		Reporter.log("executing branch test");
	}
	@Test
	public void roles() throws Throwable
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Thread.sleep(3000);
		Reporter.log("executing roles test");
	}
	@Test
	public void users() throws Throwable
	{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Thread.sleep(3000);
	Reporter.log("executing users test");
}
}
