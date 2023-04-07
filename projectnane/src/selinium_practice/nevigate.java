package selinium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		
		//driver.navigate().forward();
		//Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);


		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();


		
	}

}
