package selinium_find_element;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class for_list_date_of_birth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		
		Select s = new Select(month);
		
			s.selectByIndex(9);// use index of the value
			Thread.sleep(6000);
			
			//s.selectByValue("10");// use the given value in list
			//Thread.sleep(6000);
			
			s.selectByVisibleText("Oct");// use given visible value
			Thread.sleep(6000);
			
			WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
				Select d = new Select(day);
				
				d.selectByIndex(23);//we can also use above three method ,value ,index,visible text
				Thread.sleep(4000);
				
				WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
				Select y = new Select(year);
				y.selectByValue("2011");
				

			
			
		
	}

}
