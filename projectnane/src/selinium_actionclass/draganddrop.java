package selinium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
		
	//	a.moveToElement(destination).clickAndHold().moveToElement(destination).release().build().perform();
		
		a.dragAndDrop(source, destination).perform();
		
		
	}

}
