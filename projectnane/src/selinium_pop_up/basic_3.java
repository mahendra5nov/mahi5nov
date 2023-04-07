package selinium_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_3 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 Thread.sleep(3000);
		//driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		 Thread.sleep(3000);
		 
	    Alert d = driver.switchTo().alert();
	  d.sendKeys("press button");
	  d.accept();
	    
		 Thread.sleep(5000);
		 
		 driver.close();
// System.out.println(driver.switchTo().alert().sendKeys("yes"));


	}

}
