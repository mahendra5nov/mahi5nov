package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class double_data_type {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\automotion.xlsx");
		
	double data = WorkbookFactory.create(file).getSheet("mahi").getRow(11).getCell(8).getNumericCellValue();
		
		System.out.println(data);
		
		
		
		
	}

}
