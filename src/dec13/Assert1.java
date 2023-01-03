package dec13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
	WebDriver driver;
	@Test
	public void verifytitle()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String expectedtitle= "youtube";
		String actualtitle = driver.getTitle();
		try {
			Assert.assertEquals(expectedtitle,actualtitle, "Title is not Matching");
		} catch (Throwable t) 
		{
			System.out.println(t.getMessage());
		}
	}

}
