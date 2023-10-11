package pageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.propertiesdata;

public class homepage1 {
	
	public WebDriver driver;
	
	public Properties pro = new Properties();
	
	public homepage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 public WebElement email() throws IOException 
	 {
		 String path = "C:\\Users\\Beqisoft\\Documents\\selenium\\Application\\src\\test\\java\\testData\\Register.properties";
		 
		 propertiesdata pr = new propertiesdata();
		 
		 String Email = pr.properties(path,"Email");
		 
		 return driver.findElement(By.id(Email));
		  
		 
	 }
	

}
