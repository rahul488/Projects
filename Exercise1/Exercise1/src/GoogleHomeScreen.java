import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomeScreen {

	WebDriver driver;
	
	public GoogleHomeScreen(WebDriver driver) {
		this.driver=driver;
	}

	public void enterText(String text) {
		//enter text into GoogleBox
		driver.findElement(By.name("q")).sendKeys(text);
		
	}

	public void clickonGoogleSearch() {
		//Click on googleSearch
		driver.findElement(By.name("btnK")).submit();
		
	}
}
