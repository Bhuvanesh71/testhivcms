package hivcmstestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import hivcmspages.Hivdashpage;
import hivcmspages.Hivloginpage;
import hivcmspages.Newchildpage;

public class testbase {
 
// Need to create object for all page class	
	
protected WebDriver driver;
protected Hivloginpage hivloginpage;
protected Hivdashpage hivdashpage;
protected Newchildpage newchildpage;
public String browsername="chrome";

@BeforeClass
public void setup() {	
	 switch(browsername)
	 {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "C://Users/Bhuvanesh/Desktop/browserexe/chromedriver.exe");
	    driver = new ChromeDriver();
	    System.out.println("chrome browser is launched");
	   break; 
	 case "firefox":
		System.setProperty("webdriver.gecko.driver", "C://Users/Bhuvanesh/Desktop/browserexe/geckodriver.exe");
		driver = new FirefoxDriver();
		break;	
	}
	
	driver.get("https://hiv-cmsdev.adappt.co.uk/user");
	hivloginpage=PageFactory.initElements(driver,Hivloginpage.class);
}


@AfterClass
public void close() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();	
}

}