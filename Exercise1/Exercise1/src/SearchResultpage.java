import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultpage {
	
	WebDriver driver;
	public SearchResultpage(WebDriver driver) {
		this.driver=driver;
	}
    

	public boolean isPresent() {
		if(driver.findElement(By.className("r")).isDisplayed()){
			return true;
		}
		return false;
	}
}
