package selinium_web_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_links {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> link = driver.findElements(By.xpath("//a"));
	
	      int s = link.size();
	      System.out.println(s);
	      
	      for (int i=0;i<s;i++) 
	      {
	    	  System.out.println(link.get(i).getText()+":-"+link.get(i).getAttribute("href"));
	      }
	
	
	
	}

}
