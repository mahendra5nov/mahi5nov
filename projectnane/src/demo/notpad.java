package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class notpad{

public static void main(String[] agra){

WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahendra");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mahi@123");
	driver.findElement(By.xpath("//button[@value='1']")).click();
}
}

