package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cell {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\automotion.xlsx");
		String data = WorkbookFactory.create(file).getSheet("mahi").getRow(5).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		
		
		
	}



}

