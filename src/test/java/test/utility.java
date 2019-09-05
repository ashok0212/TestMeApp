package test;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class utility {
	static WebDriver getdriver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashok.sharma\\\\SeleniumWeb\\\\driver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			//System.setProperty("", "")
			return new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			//System.setProperty("", "")
			return new InternetExplorerDriver();
		}
		else 
			return null;
	}

}
