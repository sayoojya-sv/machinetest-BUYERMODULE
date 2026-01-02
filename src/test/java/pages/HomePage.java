package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//initialize driver using constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	
	public void select_cat() {
        //select category
		WebElement sel_cat=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Jewelry']")));
		JavascriptExecutor js= (JavascriptExecutor) driver; //to click the function using javascriptexecutor
		js.executeScript("arguments[0].click();", sel_cat);
		
		//sel_cat.click();
	}
	
	//select product
	public void select_product() {
		WebElement sel_prod=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()='toys'])[1]")));
		sel_prod.click();
	}
	
	//validate productname displayed
	public boolean isProductNameDisplayed() {
		WebElement namE=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='supratoycar']")));
		return namE.isDisplayed();
		
	}
	
	//validate productpice displayed
	public boolean isProductPriceDisplayed() {
		WebElement pricE=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='$']")));
		return pricE.isDisplayed();
		
	}

}