package selinium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		WebElement customgen = driver.findElement(By.xpath("//select[contains(@name, 'preferred_pronoun')]"));
		
		boolean result = customgen.isDisplayed();//when click on custon the hidden text box is come this
		System.out.println(result);     //this method veryfy that it is visibale or not
	}

}
