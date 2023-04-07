package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class code {
	@FindBy(xpath="//a[@role='button']")private WebElement enter;
	@FindBy(xpath="//input[@maxlength='8'] ")private WebElement classcode;
	@FindBy(xpath="//button[@role='button']")private WebElement contee;
	@FindBy(xpath="//a[@role='button']")private WebElement back;
	
	public code(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entercode()
	{
		enter.click();
	}
	public void enterclasscode()
	{
		classcode.sendKeys("mahi@345");
	}
	public void conti()
	{
		contee.click();
	}
	public void Back()
	{
		back.click();
	}
	

}
