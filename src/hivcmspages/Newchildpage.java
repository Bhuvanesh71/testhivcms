package hivcmspages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hivcmstestcase.newchildpagetest;
import hivcmstestcase.testbase;

public class Newchildpage extends testbase{

	public Newchildpage (WebDriver driver){ 
		 this.driver=driver;
	    PageFactory.initElements(driver, this);
	    String MainWindow = driver.getWindowHandle();
	    String Childwindow = MainWindow;
	    String ChildWindow1 = Childwindow;
	    String ChildWindow2 = ChildWindow1;
	
}

	// Add child page
	
	@FindBy(xpath="//a[contains(text(),'Add child page')]")
	WebElement Newchildpage;
	
	@FindBy(id="edit-title")
	WebElement childpagenew;
	
	//@FindBy(xpath="//body[@spellcheck='false']")
	//WebElement childedit;
	
	
	//icon upload
	
	@FindBy(id="edit-field-icon-und-0-browse-button")
	WebElement imageup;
	
	@FindBy(id="edit-upload-upload--2")
	WebElement upimage;
	
	
	
	public Newchildpage newchildpage(){
		newchildpage = new Newchildpage (driver); 
		PageFactory.initElements(driver, Newchildpage.class );
		 Newchildpage.click();
		return newchildpage;
	}
	
	public Newchildpage childpagetitle(){
		newchildpage = new Newchildpage (driver); 
		PageFactory.initElements(driver, Newchildpage.class );
		 childpagenew.sendKeys("Info");
		return newchildpage;
	//}
	//public Newchildpage childpageedit(){
		//newchildpage = new Newchildpage (driver); 
		//PageFactory.initElements(driver, Newchildpage.class );
		 //childedit.sendKeys("These are the different mechanism to identify the same textbox – by using different attributes such as id, name, className or xpath. Here we have kept just one active & commented the others. For details on different element locators, click here");
		//return newchildpage;
}
		public Newchildpage imageupload() throws InterruptedException{
	    newchildpage = new Newchildpage (driver); 
	    PageFactory.initElements(driver, Newchildpage.class );
	    imageup.click(); // If we tap the "Browse" button to upload image icon & popup or window will opened [scrpti]
	    Thread.sleep(6000);
	     
	    String winHandleBefore = driver.getWindowHandle();      
	    for(String winHandle : driver.getWindowHandles())
	    driver.switchTo().window(winHandle);
	    upimage.click();
	   	return newchildpage;
			

}
}