package selinium_actionclass;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customlistbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement list = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(list).perform();
		Thread.sleep(2000);

		
		WebElement order = driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]"));
		a.click(order).perform();
		Thread.sleep(2000);
		
	

	}

}
