package driver; 



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	 public static Browser browser;
	 public static WebDriver driver;
	 public Browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	  public static WebDriver getDriver() {
          return driver;              
      }
	  
	  public static void setUpDriver() {
          if (browser==null) {
                 browser = new Browser();
          }
      }
	 
	
	public static void tearDown() {
		System.out.println("inside close driver");
		driver.close();
	}

}
