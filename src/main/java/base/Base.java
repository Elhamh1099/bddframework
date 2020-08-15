package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {

    // create constructors 
	// set gettermethods
	// create obj of buffered reader class 
	// initialize properties obj
	// load method of properties class to load the file 
	// .close method of bufferedreader class to close the file reading 
	// we use try catch blco to handle exeptions 
	
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private String userDirectory = System.getProperty("user.dir");
	private String propertypathFile= "\\src\\test\\resources\\inputData\\Property.properties";
	private String ppfile = userDirectory+propertypathFile;
    
	public Base () {
		
		try {
		
		BufferedReader reader; // read text by character from property file 
		
			reader = new BufferedReader(new FileReader(ppfile));
			
			properties = new Properties();
			
			try {
			properties.load(reader);
			reader.close();
			}catch (FileNotFoundException e) {
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static String getBrowserName() {
		String browserName = properties.getProperty("browser");
		return browserName;
	}

	public static String getURL() {
		String url = properties.getProperty("url");
			return url;
		}
	public static long getPageLoad () {
		String pageload = properties.getProperty("pageload");
		return Long.parseLong(pageload);
	}
	
	public static long getImolicitWait () {
		String implicitwait = properties.getProperty("implicitwait");
		return Long.parseLong(implicitwait);
	}
	
	
	public static void Intializer () {
		driver.get(getURL());
	}
	
	public static void tearDown () {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

