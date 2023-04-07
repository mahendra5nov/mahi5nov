package selinium_find_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path_by_atibutes {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@ type = 'text' ]")).sendKeys("9850822081");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@ type = 'text' ]")).clear();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@ type = 'text' ]")).sendKeys("9850822081");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys("mahimahi");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@value ='1']")).click();
		Thread.sleep(20000);
		
		driver.close();
	}

}
