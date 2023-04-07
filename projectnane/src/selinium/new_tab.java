package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_tab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(03000);
		//driver.close();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/");
		Thread.sleep(03000);
		driver.quit();

	}

}
