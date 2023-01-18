package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	String login_url="https://www.qa.tax.service.gov.uk/auth-login-stub/gg-sign-in";
	WebDriver driver;
	public WebElement findElementByXPath(String xpath){
		return driver.findElement(By.xpath(xpath));
		
	}
}
