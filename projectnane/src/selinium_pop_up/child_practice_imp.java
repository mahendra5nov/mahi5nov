package selinium_pop_up;

import java.util.ArrayList
;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_practice_imp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		WebElement veriable = driver.findElement(By.xpath("//input[@name=\"NewTab\"]")); // main browser
		Thread.sleep(2000);

		
		veriable.click();
		 Set<String> multi = driver.getWindowHandles();
		 ArrayList<String> id = new ArrayList<String>(multi);//    shifting code to child browser
		String index = id.get(1);
	
		driver.switchTo().window(index);
		
		driver.findElement(By.xpath("(//span[text()='TechStuff'])[1]")).click();
		//driver.findElement(By.xpath("//span[text()='Offline Installer']")).click();
		Thread.sleep(2000);

		String home = id.get(0);
		driver.switchTo().window(home);
		  WebElement element = driver.findElement(By.xpath("//input[@name=\"NewTab\"]"));// shifting to main browser
			Thread.sleep(2000);

		 		  
		  element.click();
		   Set<String> cl = driver.getWindowHandles();
		   ArrayList<String> ind = new ArrayList<String>(cl);
		   ind.get(2);
		   
		   driver.switchTo().window(ind.get(2));
		
		//driver.findElement(By.xpath("(//a[@rel=\"noopener\"])[2]")).click();
		driver.findElement(By.xpath("//a[@id=\"default-btn-e7ee868a2a719787b1d3727d4dc156df\"]")).click();
		Thread.sleep(2000);
		
		 String child = id.get(3);
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//span[text()='HOME']")).click();
		Thread.sleep(3000);
		
		

		//driver.close();
		
	}

}
