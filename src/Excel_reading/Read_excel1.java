package Excel_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Read_excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

  File Excelsheet = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
		 
//  String output = WorkbookFactory.create(Excelsheet).getSheet("sheet 1").getRow(1).getCell(0).getStringCellValue();
//	
//  System.out.println(output);
//		
  //create shortcut for reading excel
  
        Workbook practice_excel = WorkbookFactory.create(Excelsheet);
		
		Sheet sheet1 = practice_excel.getSheet("sheet 1");
		
		//CellType type = sheet1.getRow(0).getCell(0).getCellType();
		
		//System.out.println(type);
		
		System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
		
		
		
		
	}

}
