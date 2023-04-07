package selinium_auto_sugetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugetion {
	public static void main(String []agrs) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame = driver.findElement(By.xpath("//iframe[@role=\"presentation\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		driver.switchTo().parentFrame();
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("ma");
		Thread.sleep(3000);

		List<WebElement> option = driver.findElements(By.xpath("//div[@class=\"aajZCb\"]"));
		 
		 
		//System.out.println(option.size());
		for(int i=0;i<option.size();i++) 	{	
			System.out.println(option.get(i).getText());
		}
	
//		for(WebElement Eachoption:option) 
//		{
//		System.out.println(Eachoption.getText());
//		}

	
	
	}

}
