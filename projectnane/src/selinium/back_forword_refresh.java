package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class back_forword_refresh {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.navigate().back();//for backword the page
		Thread.sleep(3000);
		
		driver.navigate().forward();//for forward the page
		Thread.sleep(3000);

		driver.navigate().refresh();// for refrash to page
		Thread.sleep(3000);

		driver.close();
		
	}
}
