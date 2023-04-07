package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class whole_row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\automotion.xlsx");
		
		Sheet size = WorkbookFactory.create(file).getSheet("mahi");
		short whole = size.getRow(0).getLastCellNum();
		
		System.out.println(whole);
		
		for(int i=0;i<whole;i++)
		{
		String print = size.getRow(0).getCell(i).getStringCellValue();
		System.out.print(print+",");
		 
		}		
		
	}

}
