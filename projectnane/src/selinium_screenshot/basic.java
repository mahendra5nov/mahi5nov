package selinium_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class basic {
	public static  void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	File source =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Mahendra\\OneDrive\\Pictures\\Screenshots\\selinium ss\\basicclass.jpg");

	FileHandler.copy(source, destination);
		
	}

}
