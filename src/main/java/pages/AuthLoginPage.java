package pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthLoginPage extends BasePage {
	String redirect_url          =    "http://qa.tax.service.gov.uk/single-customer-account/your-details";
	String redirectionURL_XP     =    "//input[@id='redirectionUrl']";
	String credentialStrength_XP =    "//select[@id='credentialStrength']";
	String confidentialLevel_XP  =    "//select[@id='confidenceLevel']";
	String nino_XP				 =	  "//input[@id='nino']";								
	String submit_Xp             =    "//input[@id='submit']";
	
	//Action
	
	public void Login() {
		driver=new ChromeDriver();
		driver.get(login_url);
		findElementByXPath(redirectionURL_XP).sendKeys(redirect_url);;
		findElementByXPath(credentialStrength_XP).sendKeys("strong");;
		findElementByXPath(confidentialLevel_XP).sendKeys("200");;
		findElementByXPath(nino_XP).sendKeys("ER872414B");;
		findElementByXPath(submit_Xp).click();;
		
	}

}
