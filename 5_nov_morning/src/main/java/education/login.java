package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(xpath="//a[text()='Login']")private WebElement loginlink;
	@FindBy(xpath="//input[@type='text']")private WebElement user;
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	@FindBy(xpath="//button[@role='button']")private WebElement submit;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Login()
	{
		loginlink.click();
	}
	public void userid()
	{
		user.sendKeys("mahendrakolte2410@gmail.com");
	}
	public void password()
	{
		pass.sendKeys("mahi@123");
	}
	public void Submit()
	{
		submit.click();
	}
	
}
