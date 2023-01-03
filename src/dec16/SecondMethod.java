package dec16;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondMethod {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\demo2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("naani");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are:: "+rc);
		//read each cell data
		String fname = ws.getRow(3).getCell(0).getStringCellValue();
		String mname = ws.getRow(4).getCell(1).getStringCellValue();
		String lname = ws.getRow(5).getCell(2).getStringCellValue();
		int eid =(int) ws.getRow(6).getCell(3).getNumericCellValue();
		System.out.println(fname+"   "+mname+"  "+lname+" "+eid);
		fi.close();
		wb.close();

	}

}
