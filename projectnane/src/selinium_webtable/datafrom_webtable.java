package selinium_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datafrom_webtable {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		Thread.sleep(3000);
		for(int i=1;i<row.size();i++) {
		
		 List<WebElement> cellno = driver.findElements(By.xpath("//table[@ id='customers']//tr["+(i+1)+"]//td"));
		for(int cell=0;cell<cellno.size();cell++) 
		{
			System.out.print(cellno.get(cell).getText()+" ");
		}
		  System.out.println();
		 
		} 
	}

}
