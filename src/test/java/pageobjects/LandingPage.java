package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LandingPage extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginlink;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerlink;
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLoginlink() {
		
		clickOnWebElement(driver, loginlink);
	}
	
	public String validateLandingPageTitle() {
		
		String title = driver.getTitle();
		return title;
	}
	
	

}
