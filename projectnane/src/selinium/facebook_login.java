package selinium;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class facebook_login {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("8975808650");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@ type = 'text']")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("8975808650");
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dinkarffffff");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@ value = '1']")).click();
		Thread.sleep(3000);
		
		
		//driver.close();
	}

}
