package selinium_wait;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicite {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahendra");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mgnbb*123");
		driver.findElement(By.xpath("//div[@class='_9lsa']")).click();
		//driver.findElement(By.xpath("//button[@value='1']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='12']"))).click();
		
		
	}

}
