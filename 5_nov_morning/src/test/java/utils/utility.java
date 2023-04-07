package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	public static void capturess(WebDriver driver , int TestId) throws IOException
	{
	
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH mm ss ");
		LocalDateTime now =LocalDateTime.now();
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 File destination = new File("test-output//screenshot//test="+TestId+" "+date.format(now)+".jpg");
	 FileHandler.copy(source, destination);
	}
}
