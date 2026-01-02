package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	}
	
	
	public void select_cat() {
		WebElement sel_cat=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Jewelry']")));
		sel_cat.click();
	}
	public void select_product() {
		
		WebElement sel_prod=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()='toys'])[1]")));
		sel_prod.click();
	}
	
	public boolean isProductNameDisplayed() {
		WebElement namE=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='supratoycar']")));
		return namE.isDisplayed();
		
	}
	
	public boolean isProductPriceDisplayed() {
		WebElement pricE=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='$']")));
		return pricE.isDisplayed();
		
	}

}