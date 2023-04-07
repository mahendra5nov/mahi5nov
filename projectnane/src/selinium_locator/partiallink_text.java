package selinium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink_text {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/signup");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.partialLinkText("users")).click();// link part present on
		 															//facebook signup page at bottom
		 Thread.sleep(3000);// to click on the link by takaking some part inthe present link
	}

}
