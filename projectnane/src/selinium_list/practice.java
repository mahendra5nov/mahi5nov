package selinium_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement list = driver.findElement(By.xpath("//select[@id='multiselect1']"));
	list.click();
	Select s = new Select(list);
	
	 boolean m = s.isMultiple();
	 if(m==true) {System.out.println("multiselected"+ m);}
	 else {System.out.println("not multi"+m);}
	
	
	s.selectByIndex(2);
	Thread.sleep(3000);
	
	s.deselectByIndex(2);
	Thread.sleep(3000);

	s.selectByIndex(1);
	Thread.sleep(3000);

	
}
}
