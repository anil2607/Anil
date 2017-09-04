package sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	
	@Given("^Open application url$")
	public void open_application_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin/142-3878395-2600822?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%2F142-3878395-2600822%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		
	}

	@When("^Enter username and passwords$")
	public void enter_username_and_passwords() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("anilkumarpython@gmail.com");
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("8688694505");
	}

	@When("^click login into url$")
	public void click_login_into_url() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
	
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
		System.out.println("login successful");
	   driver.quit();
	}

}
