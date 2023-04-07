package sauit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import education.code;
import education.login;
import education.logout;
import education.progres;
import education.teacher;

public class basicanotation {
	WebDriver driver;
	login l;
	teacher t;
	logout lo;
	code co;
	progres pr;
	
	@BeforeClass
	public void befireclass()
	{
		 driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		 l =new login(driver);
		 l.Login();
		 l.userid();
		 l.password();
		 l.Submit();
	}
	
	
	@Test
	public void teachrs()
	{
		t = new teacher(driver);
		t.teach();
	}
	
	@Test
	public void testcode()
	{
		t.teach();
		co = new code(driver);
		co.entercode();
		co.enterclasscode();
		co.conti();
		co.Back();
	}
	@Test
	public void testprogress()
	{
		pr = new progres(driver);
		pr.Progress();
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		lo = new logout(driver);
		lo.mahendra();
		lo.OUT();
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
		}
}
