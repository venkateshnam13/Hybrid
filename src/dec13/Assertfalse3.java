package dec13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse3 {
	WebDriver driver;
	@Test
	public void verifytitle()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tspsc.gov.in/");
		String expectedtitle= "tspsc";
		String actualtitle = driver.getTitle();
		try {
			Assert.assertFalse(expectedtitle.equalsIgnoreCase(actualtitle), "Title is  Matching");
		} catch (Throwable t) 
		{
			System.out.println(t.getMessage());
		}
	}
}
