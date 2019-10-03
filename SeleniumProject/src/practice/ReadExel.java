package practice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\debma\\Desktop\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row =sheet.getRow(0);
		Row row2 =sheet.getRow(1);
		Cell cell =row.getCell(0);
		Cell cell2 =row2.getCell(1);
		System.out.println(cell2);
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(1).getCell(0));

	}

}
