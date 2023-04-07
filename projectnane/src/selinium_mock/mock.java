package selinium_mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class mock {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\mock.xlsx");
		String s = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(s);
	
	
	}

}
