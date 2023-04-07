package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_newtab {
	public static void main (String [] agrs) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/feed/");
		Thread.sleep(20000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(10000);
		//driver.close();
		//Thread.sleep(10000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(10000);
		driver.close();
		
		


}
}
