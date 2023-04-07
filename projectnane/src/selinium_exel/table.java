package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class table {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\multiplestring.xlsx");
	Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
	 int lastrow = data.getLastRowNum();
	short lastcell = data.getRow(0).getLastCellNum();
	
	//System.out.println(data);
	
	for(int i=0;i<=lastrow;i++) {
		for(int j=0;j<lastcell;j++)
		{
			String print = data.getRow(i).getCell(j).getStringCellValue();
			System.out.print(print+"   ");
		}
		System.out.println();
	
	}
	}
}