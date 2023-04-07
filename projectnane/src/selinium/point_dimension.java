package selinium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class point_dimension {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
//		Dimension d = new Dimension(350, 600);
//		driver.manage().window().setSize(d);
//		Thread.sleep(3000);
//		
//		Point p = new Point(300, 200);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
//		
		
		
		driver.close();
	}

}
