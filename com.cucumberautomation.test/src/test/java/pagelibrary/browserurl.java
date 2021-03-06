package pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserurl {
	
	public WebDriver driver;
	
	public  WebDriver startBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}

}
