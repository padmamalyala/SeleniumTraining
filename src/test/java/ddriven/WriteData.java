package ddriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Datatest");
		XSSFRow rows1 = sheet.createRow(0);
		rows1.createCell(0).setCellValue("java");
		rows1.createCell(1).setCellValue("45");
		XSSFRow rows2 = sheet.createRow(1);
		rows2.createCell(0).setCellValue("c");
		rows2.createCell(1).setCellValue("testing");
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Testdata\\myfile.xlsx");
		workbook.write(file);

		workbook.close();
		file.close();
	}

}
