package selinium_pop_up;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alart_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		Thread.sleep(3000);

		 Alert a = driver.switchTo().alert();
			Thread.sleep(3000);
			
			driver.close();

	}

}
