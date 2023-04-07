package selinium_auto_sugetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one_option {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("erica");
		Thread.sleep(3000);
		
		 WebElement shift = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(shift);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.switchTo().defaultContent();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		  for(int i=0;i<list.size();i++)
		 { String   s = "Erica Durance";
			String t = list.get(i).getText();
			  System.out.println(t);
			 
//			 if(s==t) {
//				t.c 
//			 }
			 
			 
		 }
	
	
	}

}
