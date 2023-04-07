package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cell_type_1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\cell table type.xlsx");
	Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
	//CellType ct = data.getRow(0).getCell(0).getCellType();
	 int row = data.getLastRowNum();
	short cell = data.getRow(0).getLastCellNum();
	
	for (int i=0;i<=row;i++) {
		for (int j=0;j<cell;j++) {
	
			CellType ct = data.getRow(i).getCell(j).getCellType();

	if(ct==CellType.STRING.STRING)
	{
		System.out.print(data.getRow(i).getCell(j).getStringCellValue()+" "+ct);
	}
	else if(ct==CellType.STRING.NUMERIC ) 
	{
	System.out.print(data.getRow(i).getCell(j).getNumericCellValue()+" "+ct);
	}
	else if(ct == CellType.BOOLEAN)
	{
		System.out.print(data.getRow(i).getCell(j).getBooleanCellValue()+" "+ct);
	}
	
	}
		System.out.println();
		
	}}

}
