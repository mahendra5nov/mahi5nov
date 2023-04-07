package selinium_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		   List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr"));
		   row.size();
		   //System.out.println(row.size());
		   
		   for(int i=1;i<row.size();i++) {
		  List<WebElement> cell = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr["+(i+1)+"]//td"));
		  cell.size();
		  //System.out.println(cell.size());
		  for(int j=0;j<cell.size();j++)
		  {
			  System.out.print(cell.get(j).getText()+",,");
		  }
		  System.out.println();
	}
	}
}
