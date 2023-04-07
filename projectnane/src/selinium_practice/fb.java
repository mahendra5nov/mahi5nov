package selinium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fb {
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9850822081");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("narendra");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		driver.findElement(By.xpath("(//label[contains(@ class,'x1qjc9v5')])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ashvini Sakhare']")).click();
		
		
		
		
		
		
	}

}
