package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cell_type {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\celltype.xlsx");
		CellType data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getCellType();
	
	   System.out.println(data);
	
	}

}

