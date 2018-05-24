package hivcmspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hivcmstestcase.testbase;

// extend testbase class for each page class

public class Hivloginpage extends testbase{
	
	// Create constructor for all class 
	public Hivloginpage (WebDriver driver) { 
    this.driver=driver;
    PageFactory.initElements(driver, this);
   
	}
	
	@FindBy (id="edit-name")
	WebElement username;
	
	@FindBy (id="edit-pass")
	WebElement password;
	
	@FindBy (id="edit-submit")
	WebElement login;
	
	
	public Hivloginpage enterusername() {
		hivloginpage = new Hivloginpage (driver); 
		PageFactory.initElements(driver, Hivloginpage.class );
		username.sendKeys("adapptadmin");
		return hivloginpage;
	}
	
	
	public Hivloginpage enterpassword() {
		hivloginpage = new Hivloginpage (driver); 
		PageFactory.initElements(driver, Hivloginpage.class );
		password.sendKeys("@dappt890");
		return hivloginpage;
	}
	
	public Hivloginpage click_login() {
		hivloginpage = new Hivloginpage (driver); 
		PageFactory.initElements(driver, Hivloginpage.class );
		login.click();
		return hivloginpage;
	}
	
	public Hivloginpage login_wait() throws InterruptedException {
		hivloginpage = new Hivloginpage (driver); 
		PageFactory.initElements(driver, Hivloginpage.class );
		Thread.sleep(3000);
		return hivloginpage;
	}
	
	public Hivloginpage verify_login() throws InterruptedException {
		hivloginpage = new Hivloginpage (driver); 
		PageFactory.initElements(driver, Hivloginpage.class );
		enterusername().enterpassword().login_wait().click_login();
		return hivloginpage;
	}
	
	// Connectivity scenario for next page and ensure class name [Navigation Purpose]
	
	public Hivdashpage move_todashboard() throws InterruptedException {
    	hivdashpage = new Hivdashpage (driver); 
		PageFactory.initElements(driver, Hivdashpage.class );
		Thread.sleep(3000);
		return hivdashpage;
	}
}