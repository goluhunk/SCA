package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.Browser;

public class BasePage {
	
	WebDriver driver=Browser.getDriver();

	String login_url="https://www.qa.tax.service.gov.uk/auth-login-stub/gg-sign-in";
	public WebElement findElementByXPath(String xpath){
		return driver.findElement(By.xpath(xpath));
		
	}
}
