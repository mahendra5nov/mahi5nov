package selinium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		
		 WebElement enable = driver.findElement(By.xpath("//button[@type='submit']"));
		//enable.click();
		 //Thread.sleep(3000);
		 
		 boolean result = enable.isEnabled();
		
		 System.out.println(result);
	}

}
