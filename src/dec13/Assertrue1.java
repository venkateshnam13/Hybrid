package dec13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertrue1 {
	WebDriver driver;
	@Test
	public void verifytitle()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/");
		String expectedtitle= "w3schools";
		String actualtitle = driver.getTitle();
		try {
			Assert.assertTrue(expectedtitle.equalsIgnoreCase(actualtitle), "Title is Not Matching");
		} catch (Throwable t) 
		{
			System.out.println(t.getMessage());
		}
	}
}
