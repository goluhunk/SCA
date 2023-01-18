package driver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {
	
	public void load() {
		WebDriverManager.chromedriver().setup();
	
	}

}
