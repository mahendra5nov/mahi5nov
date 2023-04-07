package sauit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import education.code;
import education.login;
import education.logout;
import education.progres;
import education.teacher;

public class crossbrowser {
	WebDriver driver;
	login li;
	teacher te;
	code co;
	progres pr;
	logout lo;
	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String browsername)
	{
		System.out.println(browsername);
		if(browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
//		if(browsername.equals("Firefox"))
//		{
//			driver = new FirefoxDriver();
//		}
		if(browsername.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		li = new login(driver);
		te = new teacher(driver);
		co = new code (driver);
		pr = new progres(driver);
		lo =new logout (driver);
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		li.Login();
		li.userid();
		li.password();
		li.Submit();
	}
	
	@Test
	public void testTeacher()
	{
		te.teach();
		
	}
	
	@Test
	public void testcode()
	{
		te.teach();
		co.entercode();
		co.enterclasscode();
		co.conti();
		co.Back();
	}
	
	@Test
	public void tesrprogres()
	{
		pr.Progress();
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		lo.mahendra();
		lo.OUT();
	}
	
	@AfterClass
	public void afterclass()
	{
		li= null;
		te= null;
		co= null;
		pr= null;
		lo= null;
	}
	@AfterTest
	public void aftertest()
	{
	System.gc();
	driver.close();
	}

}
