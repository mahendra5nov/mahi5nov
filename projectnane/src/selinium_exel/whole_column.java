package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class whole_column {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\automotion.xlsx");
		
		Sheet data = WorkbookFactory.create(file).getSheet("mahi");
		int lastrow = data.getLastRowNum();
		System.out.println(lastrow);
		
		for(int i=0;i<=lastrow;i++) 
		{
			String print = data.getRow(i).getCell(2).getStringCellValue();
			System.out.println(print);
		}
	}

}
