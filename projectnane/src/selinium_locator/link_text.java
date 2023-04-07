package selinium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Developers")).click();
		Thread.sleep(3000);//
	}

}
