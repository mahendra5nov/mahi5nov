package selinium_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_selected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement month = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		Select s = new Select(month);
		     boolean result = s.isMultiple();
		     System.out.println(result);
		     if(result==  true)
		     {
		    	 System.out.println(" the given list box is multiselected");
		     }
		     else 
		     {
		    	 System.out.println("the given box not multiselected");
		     }
	}

}
