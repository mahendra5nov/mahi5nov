package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic 
	{
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//driver.quit();
		//driver.close();
		
		String title = driver.getTitle();
		System.out.println(title);
		//String exptitle = "online moblie sites for mobile ,electronics ";
		
	//String url = driver.getCurrentUrl(); // upcasting
	//System.out.println(url);
	//String expurl = "https://www.flipkart.com/";
	
		//if ( url.equalsIgnoreCase(expurl))
		//{
			//System.out.println("navigate to correct page");
		//}
		//else
		//{
			//System.out.println("navigate to invalid page");
		//}
		
		//driver.close();
	
	driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");

		
		
		

	
	

	}

}

