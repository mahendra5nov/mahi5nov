package selinium_exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class last_cell_number {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mahendra\\OneDrive\\Documents\\automotion.xlsx");
	    
		short lastcell = WorkbookFactory.create(file).getSheet("mahi").getRow(22).getLastCellNum();
	
	System.out.println(lastcell);//to find the last cell that having some value 
	
	
	/////in the last cell velue index is not show it direct show the value of the cell
	//but ehe we want fatch the value from the cell we have put the index of that preticular cell
	
	
	
	}

}
