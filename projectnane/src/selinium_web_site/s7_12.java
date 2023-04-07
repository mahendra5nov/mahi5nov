package selinium_web_site;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s7_12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bhulekh.mahabhumi.gov.in/");
		Thread.sleep(3000);
		
		 WebElement amrt = driver.findElement(By.xpath("//select[@id=\"list\"]"));
		 amrt.click();
		 Select m = new Select(amrt);
	 m.selectByIndex(0);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
	
	 Set<String> w = driver.getWindowHandles();
	 ArrayList<String> i = new ArrayList<String>(w);
	String aaaa = i.get(1);
	 driver.switchTo().window(aaaa);
	
	 WebElement is = driver.findElement(By.xpath("(//input[@name=\"ror\"])[2]"));
	 is.click();
	boolean a = is.isSelected();
	if(a==true)
	{System.out.println("selected "+a);}
	else {System.out.println("not selected"+a);}
		 
		WebElement o = driver.findElement(By.xpath("//select[@id=\"distSelect\"]"));
		o.click();
		Select p =new Select(o);
		  p.selectByValue("2");
		  
		 WebElement tal = driver.findElement(By.xpath("//select[@id=\"talSelect\"]"));
		  tal.click();
		 Select s = new Select(tal);
		 s.selectByValue("10");
		 tal.isDisplayed();
		

		
		
		 
		 
	}

}
