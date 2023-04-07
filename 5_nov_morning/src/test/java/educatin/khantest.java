package educatin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import education.code;
import education.login;
import education.logout;
import education.progres;
import education.teacher;

public class khantest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
		
		login l = new login(driver);
		l.Login();
		l.userid();
		l.password();
		l.Submit();
		
		teacher t = new teacher(driver);
		t.teach();
		Thread.sleep(1000);

		code c = new code(driver);
		c.entercode();
		c.enterclasscode();
		c.conti();
		Thread.sleep(1000);
		c.Back();
		
		progres p =new progres(driver);
		p.Progress();
		
		logout lo = new logout(driver);
		lo.mahendra();
		lo.OUT();
	}

}
