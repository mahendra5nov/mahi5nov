package selinium_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class all_selected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		 WebElement month = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		
		Select s = new Select(month);
		s.selectByIndex(9);
		Thread.sleep(2000);

		//s.deselectByIndex(9);
		//Thread.sleep(2000);
		
		s.selectByValue("5");// use to print all select value 
		Thread.sleep(1000);
		
		        List<WebElement> alloption = s.getAllSelectedOptions();
		       for(int i=0;i<=alloption.size()-1;i++)
		       {
		    	   System.out.println(alloption.get(i).getText());
		       }
	}

}
