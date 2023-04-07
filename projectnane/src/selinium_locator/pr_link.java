package selinium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr_link {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		//driver.findElement(By.linkText("Games")).click();
		//driver.findElement(By.partialLinkText("and")).click();
		//driver.findElement(By.name("lastname")).sendKeys("rutuja");
		driver.findElement(By.id("password_step_input")).sendKeys("tariq");
		Thread.sleep(5000);
	}

}
