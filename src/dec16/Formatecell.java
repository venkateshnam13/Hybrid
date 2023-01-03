package dec16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Formatecell {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\demo2.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("naani");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::  "+rc);
		for (int i = 1; i <=rc; i++)
		{
		//ws.getRow(i).createCell(4).setCellValue("pass");
		ws.getRow(i).createCell(4).setCellValue("fail");
		XSSFCellStyle style = wb.createCellStyle();
		XSSFFont font = wb.createFont();
		//color text into Green
		//font.setColor(IndexedColors .GREEN.getIndex());
		font.setColor(IndexedColors.RED.getIndex());
		font.setBold(true);
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		ws.getRow(i).getCell(4).setCellStyle(style);
		}
		fi.close();FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Documents\\demo2.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
