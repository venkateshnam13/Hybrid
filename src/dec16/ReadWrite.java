package dec16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\demo2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("naani");
		int rc = ws.getLastRowNum();
		 for (int i = 1; i <=rc; i++) {
			 String fname = ws.getRow(i).getCell(0).getStringCellValue();
			 String mname = ws.getRow(i).getCell(1).getStringCellValue();
			 String lname = ws.getRow(i).getCell(2).getStringCellValue();
			 int eid= (int) ws.getRow(i).getCell(3).getNumericCellValue();
			 System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
			 //write same text into results cell
			 ws.getRow(i).createCell(4).setCellValue("pass");
		}
		 fi.close();
		 //write into new wb
		 FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Documents\\demo2.xlsx");
		 wb.write(fo);
		 fo.close();
		 wb.close();
	}
}
