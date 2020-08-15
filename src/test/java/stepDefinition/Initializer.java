package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import base.Base;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer  extends Base {

	@Before
	public void beforeHooks () {
		
		String browserName = Base.getBrowserName();
		
		switch (browserName) {
		case "chrome ":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "FF":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
		
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
			
			default:
				 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
		}
		
			
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(getPageLoad(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImolicitWait(), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		
		
		
	}
	
	
	
	public void afterHooks() {
		
		Base.tearDown();
		
	}
	
	
	
	
	
	
	
}
