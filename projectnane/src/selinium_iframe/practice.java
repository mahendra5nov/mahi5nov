package selinium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(3000);
		//driver.switchTo().defaultContent(); // thos method is directly nevigate to the main frame
		
		driver.switchTo().parentFrame();// this method is nevigate to the parent frame of iframe
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	
	}

}
