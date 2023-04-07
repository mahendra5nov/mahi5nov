package selinium_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]")).click();
		Thread.sleep(3000);
		https://nxtgenaiacademy.com/alertandpopup
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		
		
		driver.close();
		
	}

}
