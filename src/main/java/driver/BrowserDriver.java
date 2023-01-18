package driver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {
	
	public void load() {
		System.out.println("inside WebDriver Manager");
		WebDriverManager.chromedriver().setup();
	
	}

}
