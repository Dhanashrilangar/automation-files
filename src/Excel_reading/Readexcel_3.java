package Excel_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read complete excel sheet

		File Excelsheet = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
		
		Sheet practicesheet = WorkbookFactory.create(Excelsheet).getSheet("sheet 1");
		
	System.out.println("====static coding for read whole data======");
	
		for(int i=0;i<=4;i++) // outer forloop rows
			
		{
		for(int j=0;j<=3;j++)   //inner forloop cells
			{
        String wholesheet = practicesheet.getRow(i).getCell(j).getStringCellValue();
        System.out.print(wholesheet + " || ");
		
			}
			System.out.println();	
			
	}

}
	}
