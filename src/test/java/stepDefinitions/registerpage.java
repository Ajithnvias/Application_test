package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import CommonUtils.propertiesdata;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homepage1;

public class registerpage {
	
	public WebDriver driver;
	
	public Logger log;
	
	@Given("Access the index page url")
	public void access_the_index_page_url() throws IOException {
		
		log = LogManager.getLogger(registerpage.class);
		driver = new ChromeDriver();
		String path = "C:\\Users\\Beqisoft\\Documents\\selenium\\Application\\src\\test\\java\\testData\\Register.properties";
		 
		 propertiesdata pr = new propertiesdata();
		 
		 String key = "url";
		 
		 Object url1 = pr.properties(path,key);
		 
		 driver.get((String) url1);
		 log.info(log);
		 log.info("Access the index page url");
	    
	}

	@When("page loads")
	public void page_loads() {
		
		System.out.println("done");
	    
	}

	@Then("Enter the vaild Email id")
	public void enter_the_vaild_email_id() throws IOException {
		
		homepage1 ho = new homepage1(driver);
		
		ho.email().sendKeys("121321@gamil.com");
		log.info("Enter the vaild Email id");
	  
	}
	
	@Then("take a screenshot")
	public void take_a_screenshot() throws IOException {
	   
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Beqisoft\\Documents\\selenium\\Application\\Screenshot"+"\\test1.jpg");
		Files.copy(src, des);
		log.info("take a screenshot");
		driver.close();
		
	}


}
