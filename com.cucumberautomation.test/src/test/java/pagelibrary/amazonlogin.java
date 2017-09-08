package pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazonlogin {
	WebDriver driver;
	
	public amazonlogin(WebDriver driver){
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH,using=(".//*[@id='ap_email']"))
	WebElement username;
	@FindBy(how=How.XPATH,using=(".//*[@id='ap_password']"))
	WebElement password;
	@FindBy(how=How.XPATH,using=(".//*[@id='signInSubmit']"))
	WebElement submit;

	
	public void loginpage(String usr, String pass){
		
		username.sendKeys(usr);
		password.sendKeys(pass);
		submit.click();
	}
}
