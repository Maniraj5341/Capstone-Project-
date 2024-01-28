package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 private static WebDriver driver;

	    public static WebDriver getDriver()

	    {
	        if (driver == null) {
	        	
	            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaval\\Desktop\\automation\\Selenium_BDD_Java\\Drivers\\chromedriver.exe"); // Replace with actual path
	            driver = new ChromeDriver();
	        }
	        return driver;
	    }


}
