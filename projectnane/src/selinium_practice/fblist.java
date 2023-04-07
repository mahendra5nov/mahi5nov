package selinium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fblist {
	public static void main(String[] agrs)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select s = new Select(month);
			s.selectByIndex(4);
			System.out.println(s.getFirstSelectedOption().getText());
			driver.close();
			
	}

}
