package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class progres{
	@FindBy(xpath="//span[text()='Profile']")private WebElement process;
	
	public progres(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Progress()
	{
		process.click();
	}

}
