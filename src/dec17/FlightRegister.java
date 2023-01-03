package dec17;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightRegister {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	@Test
	public void startTest() throws Throwable
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\flight.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Register");
		int rc = ws.getLastRowNum();
		Reporter.log("No of rows are::  "+rc,true);
		for (int i = 0; i <=rc; i++) 
		{
			driver.get("http://flights.qedgetech.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Register")).click();
			String name = ws.getRow(i).getCell(0).getStringCellValue();
			if (wb.getSheet("Register").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata = (int)wb.getSheet("Register").getRow(i).getCell(1).getNumericCellValue();
				String Cnumber = String.valueOf(celldata);
				String email = ws.getRow(i).getCell(2).getStringCellValue();
				String password =ws.getRow(i).getCell(3).getStringCellValue();
				String gender = ws.getRow(i).getCell(4).getStringCellValue();
				driver.findElement(By.name("name")).sendKeys(name);
				driver.findElement(By.name("contact")).sendKeys(Cnumber);
				driver.findElement(By.name("email")).sendKeys(email);
				driver.findElement(By.name("password")).sendKeys(password);
				new Select(driver.findElement(By.name("gender"))).selectByVisibleText(gender);
				driver.findElement(By.id("popupDatepicker")).click();
				driver.findElement(By.linkText("23")).click();
				driver.findElement(By.id("flexCheckChecked")).click();
				driver.findElement(By.name("submit")).click();
			}
		}
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}

