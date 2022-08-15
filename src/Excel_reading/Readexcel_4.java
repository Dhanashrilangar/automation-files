package Excel_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//dynamic coding for whole same datatype table reading	
	File practice_excel = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
		Sheet practice = WorkbookFactory.create(practice_excel).getSheet("practice");
		System.out.println(practice.getRow(0).getCell(0).getStringCellValue());
		
	int totalrows = practice.getLastRowNum();
		System.out.println(totalrows);
	int totalcells = (practice.getRow(totalrows).getLastCellNum()-1);
	System.out.println(totalcells);

for(int i=0;i<=totalrows;i++)
{
	for(int j=0;j<=totalcells;j++) {
		String totaldata = practice.getRow(i).getCell(j).getStringCellValue();
		System.out.print(totaldata +"  ||");
	}
	System.out.println();
}
	
	
		
		
		
		
		
		
		
		
		
	}

}
