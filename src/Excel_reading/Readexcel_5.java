package Excel_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel_5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read whole type data by using if else method
File practice_excel = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
Sheet practice = WorkbookFactory.create(practice_excel).getSheet("Sheet1");
		
	int totalrows = practice.getLastRowNum();
	int totalcells = practice.getRow(0).getLastCellNum()-1;
		
for(int i=0;i<=totalrows;i++)	
{
	for(int j=0;j<=totalcells;j++)
	{
		 Cell totalrowcell = practice.getRow(i).getCell(j);
	     CellType type = totalrowcell.getCellType();
		
		if(type==CellType.STRING)
{
	System.out.print(totalrowcell.getStringCellValue()+" |");
}
		else if	(type==CellType.BOOLEAN)
		{
			System.out.print(totalrowcell.getBooleanCellValue()+" |");

		}
		else if (type==CellType.NUMERIC)
		{
			System.out.print(totalrowcell.getNumericCellValue()+" |");

		}
		else if (type==CellType.BLANK)
		{
			System.out.print(totalrowcell+"--------------------------------");
		}	
		
	}
	System.out.println();

}
		
		
		
		
		
		
		

	}

}
