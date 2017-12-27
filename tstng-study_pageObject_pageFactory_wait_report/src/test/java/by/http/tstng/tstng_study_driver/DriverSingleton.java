package by.http.tstng.tstng_study_driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DriverSingleton {

	private static WebDriver driver;

	public static WebDriver getDriver() {

		if (null == driver) {
			driver = new HtmlUnitDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
		}

		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}

}
