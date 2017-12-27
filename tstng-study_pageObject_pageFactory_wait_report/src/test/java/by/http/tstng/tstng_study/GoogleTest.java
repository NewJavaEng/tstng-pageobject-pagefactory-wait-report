package by.http.tstng.tstng_study;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import by.http.tstng.tstng_study_pages.GoogleMainPage;

public class GoogleTest {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		WebDriver driver = new HtmlUnitDriver();
		// Navigate to the right place
		driver.get("http://www.google.com/");

		WebElement explicitWait = (new WebDriverWait(driver, 10))
				// или пока не появился элемент с id=bar
				.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));

		// Create a new instance of the search page class
		// and initialise any WebElement fields in it.
		GoogleMainPage page = PageFactory.initElements(driver, GoogleMainPage.class);

		// And now do the search.
		page.searchFor("Cheese");

		String namePage = driver.getTitle();
		assertEquals(namePage, "Cheese - Пошук Google");

		System.out.println("You are great!");

	}

}
