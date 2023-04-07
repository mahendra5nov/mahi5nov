package selinium_webtable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class webtableelement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		 List<WebElement> table = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		System.out.println(table.size());
		
		 List<WebElement> cell = driver.findElements(By.xpath("//table[@ id='customers']//tr[\"+(i+1)+\"]//td"));
		
		System.out.println( cell.size());
		
		///// to print the total rows and total cell use  this pragram
		 
		 
		 
	}

	

}
