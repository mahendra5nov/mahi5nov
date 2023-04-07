package selinium_find_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_containsand_index {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input [contains (@ name , 'rstname')]")).sendKeys("shree");
	Thread.sleep(3000);
	// x-path using contains method
	
	driver.findElement(By.xpath("//input[contains(@ type,'text')][1]")).sendKeys("ram");
	Thread.sleep(3000);
	// x-path by using index method
	
	

}}
