package selinium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[@id=\"u_0_0_F1\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("mahendra");

	}

}
