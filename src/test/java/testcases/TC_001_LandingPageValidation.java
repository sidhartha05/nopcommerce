package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BasrTest;
import pageobjects.LandingPage;
import pageobjects.LoginPage;

public class TC_001_LandingPageValidation extends BasrTest{
	
	
	@Test
	public void landingPageValidation() {
		
		LandingPage page=new LandingPage(driver);
		String acttitle = page.validateLandingPageTitle();
		Assert.assertEquals(acttitle, "nopCommerce demo store");
		page.clickOnLoginlink();
		
	}
	
	@Test(dependsOnMethods = "landingPageValidation")
	public void loginPageValidation() {
		
		LoginPage login=new LoginPage(driver);
		String loginactualtitle = login.validateLoginPageTitle();
		Assert.assertEquals(loginactualtitle, "nopCommerce demo store. Login");
		login.enterEmailid(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));
		login.clickOnLoginbtn();
	}

}
