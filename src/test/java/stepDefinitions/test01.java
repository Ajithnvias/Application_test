package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.homepage1;

public class test01 {
	
	public  WebDriver driver;
	
	@Given("Access the index page url {string}")
	public void access_the_index_page_url(String string) {
		
        driver= new ChromeDriver();
		
		driver.get(string);
	    
	}

	@Then("Enter the vaild {string}")
	public void enter_the_vaild(String string) throws IOException {
		
		homepage1 ho = new homepage1(driver);
		
		ho.email().sendKeys(string);
		driver.close();
		
	   
	}
	
	@Then("Entered <username> is correct")
	public void entered_username_is_correct(DataTable dataTable) throws IOException {
		
		List<List<String>> li = dataTable.asLists(String.class);
		for(int i=0;i<li.size();i++)
		{
			for(int j=i;j<li.size();j++)
			{
				System.out.println(dataTable.column(i).get(j));
			}
		}
		
		XSSFWorkbook af = new XSSFWorkbook("C:\\Users\\Beqisoft\\Desktop\\01-02-2023 MoM.xlsx");
		XSSFSheet sheet = af.getSheet("Sheet1");
		int st = (int) sheet.getRow(0).getCell(0).getNumericCellValue();
		System.out.println(st);
	   
	}

}
