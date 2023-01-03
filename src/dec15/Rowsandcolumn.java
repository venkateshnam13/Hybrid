package dec15;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rowsandcolumn {

	public static void main(String[] args)throws Throwable {
		//read path of excel file
				FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\dem01.xlsx");
				//get Workbook from sample file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws =wb.getSheet("SI");
				//get first row from sheet
				XSSFRow row  = ws.getRow(0);
				//count no of rows in sheet
				int rc =ws.getLastRowNum();
				//count no of cells in first row
				int cc = row.getLastCellNum();
				System.out.println("No of rows::"+rc+"   "+"No of cels ::"+cc);
				fi.close();
				wb.close();

			}
	}


