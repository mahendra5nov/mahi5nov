package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class teacher {
	@FindBy(xpath= "//span[text()='Teachers']") private WebElement tea; 
	public teacher(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void teach() 
	{
		tea.click();
	}
	
	
}
  
