package selinium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contexclick {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		
		WebElement web = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Actions a = new Actions(driver);
		//a.moveToElement(web).perform();//not require
		a.contextClick(web).perform();
		
		
		
	//	driver.findElement(By.xpath("//div[text()='Orders']"));   //order
	}

}
