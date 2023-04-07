package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select s = new Select(month);
		 s.selectByIndex(9);
		 System.out.println(s.getFirstSelectedOption().getText());
		 driver.close();
		 
		 
		
	}

}
