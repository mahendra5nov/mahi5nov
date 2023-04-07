package selinium_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ss_random_name {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		for (int i=1;i<=6;i++)
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String random = RandomString.make(2);
			File destination = new File("C:\\Users\\Mahendra\\OneDrive\\Pictures\\Screenshots\\selinium ss\\random"+random +".jpg");
			FileHandler.copy(source, destination);
		}
	}

}
