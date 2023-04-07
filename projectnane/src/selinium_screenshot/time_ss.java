package selinium_screenshot;

import java.io.File;


import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class time_ss {
	public static void main(String[] args) throws IOException {
		
		
		Timestamp t = new Timestamp(System.currentTimeMillis()); 
		System.out.println(t);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\Mahendra\\OneDrive\\Pictures\\Screenshots\\selinium ss\\multiss"+t+".jpg");
		 FileHandler.copy(source, destination);
	}

}
