package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	public WebDriver openchromebrowser()
	{
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver openfirefoxbrowser()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	public WebDriver openegdebrowser()
	{
		WebDriver driver = new EdgeDriver();
		return driver;
		
	}
	

}
