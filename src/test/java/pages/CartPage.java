package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
	WebDriverWait wait; //initialize wait
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	//to add product to cart
	public void addCart() {
		WebElement carT=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Add to Cart'])[1]")));
		carT.click();
	}

}
