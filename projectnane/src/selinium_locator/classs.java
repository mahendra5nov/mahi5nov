package selinium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classs {
	public static void main(String[] args) 
	 throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			Thread.sleep(3000);
			
			
			driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("mahendra");// class value
			Thread.sleep(3000);// use to find the element whe class value is uniqe
			
			
	}

}
