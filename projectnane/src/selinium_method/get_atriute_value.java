package selinium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_atriute_value {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/signup");
		 Thread.sleep(3000);
		 
		WebElement ele = driver.findElement(By.xpath("//input[@type='password']"));
		
		String result = ele.getAttribute("id");//to find the value of an attribute 
												//whose x pathare present in find element
		System.out.println(result);
		 
	}

}
