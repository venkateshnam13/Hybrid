package dec8;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil1;

public class SecondTestNGclass extends AppUtil1 {
	@Test(priority=2,enabled=true)
	public void adition()throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("56567");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("874");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(3000);
		Reporter.log("Executing Addtion test",true);
	}
	@Test(priority=1, enabled = true)
	public void division()throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("77665465");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("5");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(3000);
		Reporter.log("Executing Division test",true);
	}
	@Test(priority=0,invocationCount = 2, enabled=true)
	public void multipliation() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("7676");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("76");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(3000);
		Reporter.log("Executing multipliation test",true);
	}
}
