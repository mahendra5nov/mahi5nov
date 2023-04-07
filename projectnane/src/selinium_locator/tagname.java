package selinium_locator;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("button")).click();//put tagname
		Thread.sleep(3000);
	}					//1)we cannot use this method to fint the element bcos so many same tagename 
	//are preset 
	// 2)we cannot use index for tage name
	//3) we can use it when uniqe tagename are present

}

