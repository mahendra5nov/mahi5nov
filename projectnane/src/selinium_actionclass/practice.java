package selinium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		
		driver.findElement(By.xpath("//button[@id=\"customGDPR\"]")).click();//hidden pop up
		
		//WebElement re = driver .findElement(By.xpath("//a[@title='Own a Royal Enfield']"));//customized list box
       
		WebElement shop = driver.findElement(By.xpath("//a[@title='Shop the Look']"));//customized list
		Actions a = new Actions(driver);
       a.moveToElement(shop).perform();//add thread when element are not interactable exception is occured
       Thread.sleep(20000);
       
     // WebElement fin = driver.findElement(By.xpath("//a[text()='Finance']"));//list box element
       //a.click(fin).perform();
	
      WebElement aap = driver.findElement(By.xpath("//a[text()='Apparel']"));//list box element
	a.click(aap).perform();
	
	
	}

}
