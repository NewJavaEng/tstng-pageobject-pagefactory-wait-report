package by.http.tstng.tstng_study_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage extends AbstractPage {

	@FindBy(id="lst-ib")
	@CacheLookup
	private WebElement searchForm;

	public GoogleMainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void searchFor(String text) {
		// And here we use it. Note that it looks like we've
		// not properly instantiated it yet....
		searchForm.sendKeys(text);
		searchForm.submit();
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub

	}

}
