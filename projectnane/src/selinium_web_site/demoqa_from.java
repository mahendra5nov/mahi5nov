package selinium_web_site;

import java.time.Duration;

import org.apache.fontbox.cff.FDSelect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoqa_from { 
	public static void main (String [] agrs)  {
	WebDriver driver  = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("mahendra");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kolte");
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("mahikolte@.gmail.com");

	WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
	male.click();
	
	 boolean check = male.isSelected();
	 if(check==true)
	 {
		 System.out.println(check+"male selected");
	 }
	 else 
	 {
		 System.out.println(check+"not selected");
	 }
	
	 driver.findElement(By.id("userNumber")).sendKeys("9850822081");
	 
	  driver.findElement(By.xpath("//div[@id=\"dateOfBirth\"]")).click();
	 // Actions a = new  Actions(driver);
	 // a.click().perform();
	 WebElement year = driver.findElement(By.xpath("//select[contains(@class,'datepicker__year')]"));
	  year.click();
	  Select s = new Select(year);
	  s.selectByVisibleText("1994");
	  
	 WebElement month = driver.findElement(By.xpath("(//select[contains(@class,'select')])[1]"));
	  month.click();
	  Select a = new Select(month);
	  a.selectByValue("10");
	   driver.findElement(By.xpath("//div[contains(@class,'024')]")).click();

driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value')]")).sendKeys("mahi");
	  
	driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']")).click();
	driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).click();
	
	driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
	
	driver.findElement(By.xpath("//textarea")).sendKeys("ffdfdbfdbfdbdfbfdbdfbhfdhfdbfdbhhfdhfdhfddfdfgdfg");
	
	 
	 
	
	}
}
