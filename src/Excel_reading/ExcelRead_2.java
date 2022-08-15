package Excel_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelRead_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		
		File Excelsheet = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
	Sheet practicesheet = WorkbookFactory.create(Excelsheet).getSheet("sheet 1");
	
	// reading multiple data from single row
	for(int i=0;i<=3;i++)
	{
        String rowsvalue = practicesheet.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(rowsvalue+" | ");
	
	}
	
	System.out.println("==============================");
	
	//reading multiple data from single cell
	
		for(int j=0;j<=3;j++)
	{		 String cellsvalue = practicesheet.getRow(j).getCell(0).getStringCellValue();
				
				System.out.print(cellsvalue+"  | ");
				
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
