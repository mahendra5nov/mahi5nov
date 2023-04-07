package selinium_find_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_patt_by_text {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text() = \"Sign up for Facebook\"]")).click();
	}// to find the text on webpage/ to very fy that text those have clickable

}
