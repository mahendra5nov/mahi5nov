package selinium_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup");
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		 Alert promt = driver.switchTo().alert();
		promt.sendKeys("yes");
		Thread.sleep(3000);
		promt.accept();
	}

}
