package selinium_pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name= 'NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> index = new ArrayList<String>(id);
		          String cbadd = index.get(1);
		         driver.switchTo().window(cbadd);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title=\"Contact me\"])[2]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(index.get(0));
		driver.findElement(By.xpath("//input[@value='Home']")).click();
		
		driver.close();
		
		
	}

}
