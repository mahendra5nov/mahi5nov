package selinium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			Thread.sleep(3000);
			
			driver.findElement(By.id("u_0_d_NO")).sendKeys("mahendra");
			Thread.sleep(3000);// this method are use find element by ising id attribute
			//99% id ise unique
	}

}
