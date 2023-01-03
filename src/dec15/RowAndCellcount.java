package dec15;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowAndCellcount {

	public static void main(String[] args) throws Throwable{
		//Read path of excel in file
		FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\Demo2.xlsx");
		//get workbook from sample file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("naani");
		//get first row from sheet
		XSSFRow row = ws.getRow(0);
		//count no of rows in sheet
		int rc = ws.getLastRowNum();
		//count no of cells in first row
		int cc = row.getLastCellNum();
		System.out.println("No of rows:: "+rc+" "+"No of cells::"+cc);
		fi.close();
		wb.close();
	}
}
