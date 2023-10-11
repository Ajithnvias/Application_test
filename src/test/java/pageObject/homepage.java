package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	public  WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"wzrk_wrapper\"]/div[2]/div[1]")
	WebElement alert;
	public WebElement alert()
	{
		
		return alert;
	}
	
	@FindBy(xpath="//*[@id=\"wzrk-cancel\"]")
	WebElement alertcancel;
	
	public WebElement alertcancel()
	{
		return alertcancel;
		
	}

}
