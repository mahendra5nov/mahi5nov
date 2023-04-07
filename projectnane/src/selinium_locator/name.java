package selinium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("kolte");//name value
		Thread.sleep(3000);  //when name attribute is present in the page for the box 
								//then we can use it 
	}

}
