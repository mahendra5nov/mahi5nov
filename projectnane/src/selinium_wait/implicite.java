package selinium_wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicite {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//deprecated method /old method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// new method use this now
		// when the element not load is show the element  not found exception
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahendra");//userid
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mahi%123");//pass
		driver.findElement(By.xpath("//div[@class='_9lsa']")).click();//view pass
		driver.findElement(By.xpath("//button[@value='1f']")).click();//login
	}

}
