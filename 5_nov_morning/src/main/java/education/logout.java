package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	@FindBy(xpath="//span[text()='mahendra kolte']")
	private WebElement mahi;
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement out;
	
	public logout(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void mahendra()
	{
		mahi.click();
	}
	public void OUT()
	{
		out.click();
	}

}
