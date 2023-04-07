package selinium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text {
      public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    	
	driver.get("https://www.guru99.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement text = driver.findElement(By.xpath("//div[@class='entry-content-wrap']"));
    	  
    	System.out.println( text.getText());
    }
}
