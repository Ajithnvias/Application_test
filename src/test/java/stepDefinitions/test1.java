package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homepage;

public class test1 {
	
	public  WebDriver driver;
	
	

	@Given("Access the url {string}")
	public void access_the_url(String string) {
		
		driver= new ChromeDriver();
		
		driver.get(string);
	}

	@When("page loads expand the page")
	public void page_loads_expand_the_page() {
		
		driver.manage().window().maximize();
	    
	}

	@Then("Verify the page title")
	public void verify_the_page_title() {
		
		String title ="Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
		String t1= driver.getTitle();
		System.out.println(t1);
		Assert.assertEquals(title, t1);  
	}
	
	@Then("close the blower")
	public void close_the_blower() {
	   driver.close();
	}
   
	@When("page wait for ten seconds")
	public void page_wait_for_ten_seconds() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}

	@Then("alert popup shoud be displayed")
	public void alert_popup_shoud_be_displayed() {
		
		homepage h1 = new homepage(driver);
		
		System.out.println(h1.alert().getText());
	   
	}

	@Then("User should click on cancel")
	public void user_should_click_on_cancel() {
		
		homepage h1 = new homepage(driver);
		
		h1.alertcancel().click();
		driver.close();
	   
	}
	

}
