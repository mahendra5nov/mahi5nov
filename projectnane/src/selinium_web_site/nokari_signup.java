package selinium_web_site;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nokari_signup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("ratan tata");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("tata@gamil.com");
		Thread.sleep(3000);
		

		 driver.findElement(By.xpath("//input[@maxlength=\"40\"]")).sendKeys("tatatruck");
		 Thread.sleep(3000);
		WebElement eye = driver.findElement(By.xpath("//button[@class=\"eye-button resman-btn-empty resman-btn-small\"]"));
		eye.click();
		boolean dis = eye.isDisplayed();
		System.out.println(dis);
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@maxlength=\"10\"]")).sendKeys("1234567890");
		Thread.sleep(5000);
		
		  driver.findElement(By.xpath("//button[@class=\"eye-button resman-btn-empty resman-btn-small\"]"));
		 Thread.sleep(2000);
		
		 WebElement fresher = driver.findElement(By.xpath("//div[@data-val=\"fresher\"]"));
		 fresher.click();
		boolean f = fresher.isSelected();
		if(f==true) {System.out.println("selected");}
		else {System.out.println("noy selected");}
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//i[@class=\"ico resman-icon resman-icon-check-box\"])[1]")).click();
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("//input[@maxlength=\"250\"]"));
		city.sendKeys("paris");
		boolean data = city.isDisplayed();
		System.out.println(data+"put of india country");
		Thread.sleep(3000);
		
		 WebElement videsh = driver.findElement(By.xpath("//input[@name=\"currentCountry\"]"));
		videsh.sendKeys("france");
		boolean d = videsh.isDisplayed();
		System.out.println(d+"country");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[@class=\"uploadResume resman-btn-primary resman-btn-small\"]")).click();
		//Thread.sleep(5000);
		
		WebElement able = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		able.click();
		boolean is = able.isEnabled();
		System.out.println(is+" enable");
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
		
	}

}
