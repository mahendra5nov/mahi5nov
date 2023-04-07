package sauit;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.baseclass;
import education.code;
import education.login;
import education.logout;
import education.progres;
import education.teacher;
import utils.utility;

public class base_utility  extends baseclass{
	WebDriver driver ;
	login l;
	teacher t;
	code c;
	progres p;
	logout out ;
	int TestId;

	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String browsername)
	{
		System.out.println(browsername);
		if(browsername.equals("Chrome"))
		{
			driver = openchromebrowser();
		}
		if(browsername.equals("Edge"))
		{
			driver = openegdebrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		l =new login(driver);
		 t = new teacher(driver);
		 c = new code(driver);
		 p = new progres(driver);
		 out = new logout(driver);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		l.Login();
		l.userid();
		l.password();
		l.Submit();
	}
	@Test
	public void validateteacher()
	{
		TestId=1;
		
		t.teach();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teache");
	}
	@Test
	public void validatecode()
	{
		TestId=2;
		
		t.teach();
		c.entercode();
		c.enterclasscode();
		c.conti();
		c.Back();
	}
	@Test
	public void validateprogres()
	{
		TestId=3;
		
		p.Progress();
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		utility.capturess(driver,TestId);
		}
		
		
		out.mahendra();
		out.OUT();
	}
	
	@AfterClass
	public void afterclass()
	{
		l =null;
		t =null;
		c= null;
		p = null;
		out = null;
		
	}
	@AfterTest
	public void aftertest()
	{
		System.gc();
		driver.close();
	}
	
}
