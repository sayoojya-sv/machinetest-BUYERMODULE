package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyerLoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BuyerLoginPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	}
	
	//to click login
	public void loginClk() {
		WebElement log_clk=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign In']")));
		log_clk.click();
	}
	
	//to send credentials
	public void loginEmail(String e_mail) {
		WebElement emaiL=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email address']")));
		emaiL.clear();
		emaiL.sendKeys(e_mail);
	}
	
	public void loginPass(String pass) {
		WebElement passw=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
		passw.clear();
		passw.sendKeys(pass);
	}
	public void signIn() throws InterruptedException {
		WebElement sign_In=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		sign_In.click();
		Thread.sleep(500);
		
		//driver.switchTo().alert().accept();
	}
	
	public boolean isHomePageDisplayed() {
		WebElement hme=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Account']")));
		return hme.isDisplayed();
		
	}

}