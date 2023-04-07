package selinium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_slected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		  WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		  male.click();
		  boolean result = male .isSelected();
		  System.out.println(result);
		  if(result== true)
		  {
			  System.out.println("given element is selected");
		  }
		  else
		  {
			  System.out.println("given element is unselected");
		  }
	}

	
}
