package espocrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import espocrm.utilities.Driver;

public class Dashboard {
	
	private WebDriver driver;

	public Dashboard() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
}
