package selinium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 String title = driver.getTitle();
		  System.out.println(title);
		  
	WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));//xpath of iframe
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();//iframe element
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//to get back to main page
		
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();//main page element
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		
	}

}
