package selinium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		
		 WebElement text = driver.findElement(By.xpath("//body[@dir='ltr']"));
		
		 		String result = text.getText();// get the text present on the entire page
		 		System.out.println(result);
	}

}
