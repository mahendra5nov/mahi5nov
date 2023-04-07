package selinium_rough_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		 WebElement radio = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));

		 Actions a = new Actions(driver);
		 a.moveToElement(radio).click().perform();
		 
	}

}
