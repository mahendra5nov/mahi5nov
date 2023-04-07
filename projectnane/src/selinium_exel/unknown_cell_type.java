package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class unknown_cell_type {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\celltype.xlsx");
	      Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		
		CellType ct = data.getRow(3).getCell(3).getCellType();
		
		if(ct==CellType.STRING)
		{
			System.out.println(" the selected cell is string type");
		}
		if(ct== CellType.NUMERIC) 
		{
			System.out.println(" the selected cell is numaric type");
		}
		if(ct==CellType.BOOLEAN)
		{
			System.out.println(" the selected cell is boolean type");

		}
		if (ct == CellType.BLANK)
		{
			System.out.println(" the selected cell is blank");

		}
		
		
		
		
		
	}

}

