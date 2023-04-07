package selinium_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class first_select {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.facebook.com/signup");
		
		WebElement year = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		Select s = new Select(year);  //for first select in list
		s.selectByIndex(9);
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
