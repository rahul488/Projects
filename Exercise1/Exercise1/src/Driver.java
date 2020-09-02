import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		Driver dr=new Driver();
		dr.searchText();
	}
	WebDriver driver=null;
	
	@Before
	public void setUp() {
		//Set path for geckoDriver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RAHUL KUMAR DAS\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	@Test
	public void searchText() {
		//create object of GoogleHomeScreen
		
		GoogleHomeScreen homeScreen=new GoogleHomeScreen(driver);
		SearchResultpage resultPage=new SearchResultpage(driver);
		
		//open google
		driver.get("https:\\www.google.com");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//enter text into google search box
		homeScreen.enterText("CODMobile");
		
		//click on google search
		homeScreen.clickonGoogleSearch();
		
		//verify id the search result page was displayed using JUnit assert statements
		
		assertTrue(resultPage.isPresent());
		
	}
	@After
	public void closeDriver() {
		//close Driver
		driver.close();
	    
	}
	
}
