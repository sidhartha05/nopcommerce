package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginPage extends BasePage {
	
	public WebDriver driver;
	@FindBy(id = "Email")
	private WebElement emailidtext;
	
	
	@FindBy(id = "Password")
	private WebElement passwordtext;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement Loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailid(String email)
	{
		
		waitforTheVisibilityOfWebelement(driver, emailidtext);
		emailidtext.sendKeys(email);
	}
	
	public void enterPassword(String pwd)
	{
		
		waitforTheVisibilityOfWebelement(driver, passwordtext);
		passwordtext.sendKeys(pwd);
	}
	
	public void clickOnLoginbtn()
	{
		
		clickOnWebElement(driver, Loginbtn);
	}
	
	public String validateLoginPageTitle() {
		
		String loginpagetitle = driver.getTitle();
		return loginpagetitle;
	}
	
	
	
	

}
