
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) {

		try {

			File f = new File(
					"C:\\Users\\udhay\\eclipse-workspace\\maven\\MavenTesting\\src\\test\\resources\\Test\\values.xlsx");

			FileInputStream fis = new FileInputStream(f);

			Workbook wb = new XSSFWorkbook(fis);
				
			Sheet createSheet = wb.createSheet("Udhaya");
			
			Row createRow = createSheet.createRow(0);
			
			Cell createCell = createRow.createCell(0);
			
			createCell.setCellValue("Welcome Udhayakumar");
			
			FileOutputStream fos = new FileOutputStream(f);
			
			wb.write(fos);
			wb.close();
			
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
