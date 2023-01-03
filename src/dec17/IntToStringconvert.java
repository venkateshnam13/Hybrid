package dec17;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntToStringconvert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\demo2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("naani");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::  "+rc);
		for(int i=1; i<=rc; i++)
		{
			if(wb.getSheet("naani").getRow(i).getCell(3).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata = (int) wb.getSheet("naani").getRow(i).getCell(3).getNumericCellValue();
				//convert to string type
				String Empid = String.valueOf(celldata);
				System.out.println(Empid);
			}
		}
	}

}
