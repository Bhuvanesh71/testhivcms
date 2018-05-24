package hivcmspages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//*[@id='edit_field_tagging_und_chosen']/ul")
	WebElement tags;
	
	// Uploading content 
	
	@FindBy(xpath="//body[@spellcheck='false']")
	WebElement childedit;
	
	
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
	
	public Newchildpage childpagetitle1(){
		newchildpage = new Newchildpage (driver); 
		PageFactory.initElements(driver, Newchildpage.class );
		 childpagenew.sendKeys("Info");
		return newchildpage;
		 
	}
	
	    public Newchildpage childpagetitle(){
		newchildpage = new Newchildpage (driver); 
		PageFactory.initElements(driver, Newchildpage.class );
		 childpagenew.click();
		 try {
		        
		        WebElement autoOptions = driver.findElement(By.xpath("//*[@id='edit_field_tagging_und_chosen']/div/ul/li[33]"));
		        autoOptions.click();

		        List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("News"));
		              int indexToSelect =2;
		          if(indexToSelect<=optionsToSelect.size()) {
		                System.out.println("Trying to select based on index: "+indexToSelect);
		                 optionsToSelect.get(indexToSelect).click();
		              }
		      }     
		      catch (NoSuchElementException e) {
		        System.out.println(e.getStackTrace());
		      }
		      catch (Exception e) {
		        System.out.println(e.getStackTrace());
		      
		      }
		return newchildpage;
		
		    
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