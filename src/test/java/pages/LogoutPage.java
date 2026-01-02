package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	
	WebDriver driver;
	WebDriverWait wait; //initialize wait
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	//to check the logoutfunction
	public void logOut() {
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Logout']")));
		log.click();
	}

}
