package selinium_web_site;




import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class nextgen {
	public static void main (String[] agrs) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("mahendra");// firstname
		driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("kolte");//lastname
		
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']")); //gender
		male.click();
		boolean a = male.isSelected();
		if(a==true)
		{System.out.println(a+" male selected");}
		else 
		{System.out.println(a+" not selected");}
		
		driver.findElement(By.xpath("//input[@id='vfb-13-address']")).sendKeys("at punhai");
		driver.findElement(By.xpath("//input[@id='vfb-13-address-2']")).sendKeys("motala");
		driver.findElement(By.xpath("//input[@id='vfb-13-city']")).sendKeys("buldhana");
		driver.findElement(By.xpath("//input[@id='vfb-13-zip']")).sendKeys("443103");
		driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys("maharashtra");
		
		 WebElement country = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
		 Actions b = new Actions(driver);
		b.click().perform();
		 Select s = new Select(country);
		 s.selectByVisibleText("India");
		 
		 driver.findElement(By.xpath("//input[@id='vfb-14']")).sendKeys("mahendrakolte@gmail.com"); //mail

		 driver.findElement(By.xpath("//input[@id='vfb-18']")).click();//clander
		  WebElement prv = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
		 prv.click();//previous page
			driver.findElement(By.xpath("//span[text()='Next']")).click(); //next
			driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']//td)[16]")).click();// date
			
		 driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click(); //time
		// Actions hours = new Actions(driver);
		 
		 
		 
		 driver.findElement(By.xpath("//li[text()='08']")).click();//hours
		 driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[3]")).click();
		 driver.findElement(By.xpath("//li[text()='55']")).click();//min
		 
		 driver.findElement(By.xpath("//input[@id='vfb-19']")).sendKeys("9850822081");
		 
		   WebElement check1 = driver.findElement(By.xpath("//input[@id='vfb-20-0']"));
		 
		   check1.click();
         boolean c1 = check1.isSelected();
		 
		 if(c1==true) {System.out.println(c1+"c1 selected");}
		 else {System.out.println(c1+"c1 not selcted");}
		 
		  WebElement tng = driver.findElement(By.xpath("//input[@id='vfb-20-2']"));
		tng.click();
		boolean c2 = tng.isSelected();
		  if(c2==true) {System.out.println(c2+"c2 selected");}
		  else {System.out.println(c2+"c2 not selected");}
		  
		  driver.findElement(By.xpath("//textarea[@id='vfb-23']"))
		  .sendKeys("this site is so tricky "); //comment box
		 
		  driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("99"); //verification
		  
//		  takess t = new takess();// screen shot
//		  t.getss();
//		  
		  driver.findElement(By.xpath("//input[@id='vfb-4']")).click();
		  
		  
		  
		  driver.close();
		  
		  
		  
		  
	}

}
