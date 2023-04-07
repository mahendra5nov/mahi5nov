package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class last_row_number {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\automotion.xlsx");
		
		   int lastrownumber = WorkbookFactory.create(file).getSheet("mahi").getLastRowNum();
		
		System.out.println(lastrownumber);//to find the index of last row where value is present
		System.out.println(lastrownumber+1);//to find the last row where the the value is present
	}

}
