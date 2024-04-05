package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasrTest implements Autoconstant {

	public WebDriver driver;
	public Properties prop;
	@BeforeSuite
	public void suitLevelExecution() {
		
		Reporter.log("suit level execution started", true);
	}
	
	@BeforeTest
	public void testLevelExecution() {
		
		Reporter.log("test level execution started", true);
	}
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(property_path);
		
			prop.load(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		driver.get(prop.getProperty("url"));
		
	}
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
}
