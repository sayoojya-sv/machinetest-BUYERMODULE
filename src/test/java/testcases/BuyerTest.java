package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BuyerLoginPage;
import pages.CartPage;
import pages.HomePage;
import pages.LogoutPage;

public class BuyerTest extends TestBase{
	
	BuyerLoginPage obj;
	HomePage hobj;
	LogoutPage lobj;
	CartPage cobj;
	
	@BeforeClass
	public void objInit() {
		obj=new BuyerLoginPage(driver);
		hobj=new HomePage(driver);
		lobj=new LogoutPage(driver);
		cobj=new CartPage(driver);
	}
	
	@Test(priority=1)
	public void Logininvalid() throws InterruptedException {
		obj.loginClk();
		obj.loginEmail("mahi@gmail.com");
		obj.loginPass("mahi12");
		obj.signIn();
		Assert.assertTrue(obj.iserrorMsgDisplayed());
		
	}
	
	@Test(priority=2)
	public void LoginTest() throws InterruptedException {
		obj.loginClk();
		obj.loginEmail("mahi@gmail.com");
		obj.loginPass("mahi123");
		obj.signIn();
	    Assert.assertTrue(obj.isHomePageDisplayed());

	}

	@Test(priority=3)
	public void ProductListTest() {
		hobj.select_cat();
		
	}
	@Test(priority=4)
	public void viewprdctDetails() {
		hobj.select_product();
	}
	
	@Test(priority=5)
	public void Val_nameandprodTest() {
		Assert.assertTrue(hobj.isProductNameDisplayed());
		Assert.assertTrue(hobj.isProductPriceDisplayed());
	}
	
	@Test(priority=6)
	public void addCartTest() {
		cobj.addCart();
	}
	
	@Test(priority=7)
	public void logoutTest() {
		lobj.logOut();
		
	}

}