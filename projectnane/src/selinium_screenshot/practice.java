package selinium_screenshot;

import java.io.File;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {
	public static <simpledataformate> void main(String[] args) throws IOException {
		
		// Timestamp t = new Timestamp(System.currentTimeMillis());
		// System.out.println(t);
		
		String time = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Mahendra\\OneDrive\\Pictures\\Screenshots\\selinium ss\\ time"+time+".jpg");
		 FileHandler.copy(source, destination);
		 
		 
		
		
	}

}
