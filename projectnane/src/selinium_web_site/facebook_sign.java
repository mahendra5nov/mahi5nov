package selinium_web_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class facebook_sign {
	public static void main (String [] agrs) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("angle");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("priya");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@name,'reg_')])[1]")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priya@123");
		Thread.sleep(3000);
		
		 WebElement day = driver.findElement(By.id("day"));
		  Select s = new Select(day);
		  s.selectByIndex(24);
		  Thread.sleep(3000);
		  
		   WebElement month = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		   Select m = new Select(month);
		   m.selectByValue("10");
		   Thread.sleep(3000);
		   
		    WebElement year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
		   Select y  = new Select(year);
		   y.selectByVisibleText("1992");
		   
		   WebElement female = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		   female.click();
		   Thread.sleep(3000);
		  boolean fe = female.isSelected();
		  if(fe== true) 
		  {
			  System.out.println("selected");
		  }
		  else {
			  System.out.println("not select");
		  }
		  
		driver.findElement(By.xpath("//Button[@type=\"submit\"]")).click();
		Thread.sleep(20000);
		driver.close();
	
	}

}
