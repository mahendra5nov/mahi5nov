package selinium_screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class multi_ss {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		Timestamp t = new Timestamp(System.currentTimeMillis());
		for(int i = 1;i<=10;i++) {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
File destination =  new File("C:\\Users\\Mahendra\\OneDrive\\Pictures\\Screenshots\\selinium ss\\multiss"+i+".jpg");
		FileHandler.copy(source, destination);
		
		}
	}
}
