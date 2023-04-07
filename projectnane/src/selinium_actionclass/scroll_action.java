package selinium_actionclass;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_action {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.album.alexflueras.ro/index.php");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			JavascriptExecutor scroll = (JavascriptExecutor)driver;
			scroll.executeScript("window.scrollBy(0,300)");//scroll up
			Thread.sleep(3000);
			
			 scroll.executeScript("window.scrollBy(0,-300)");//scroll down
			 Thread.sleep(3000);
			 
			 scroll.executeScript("window.scrollBy(3000,0)");//scroll right
			 Thread.sleep(3000);
			 
			 scroll.executeScript("window.scroll(-3000,0)");//scroll left
			 Thread.sleep(3000);
			 
			 driver.close();
		}
}
