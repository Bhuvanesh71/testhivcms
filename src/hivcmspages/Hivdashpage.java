package hivcmspages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hivcmstestcase.newchildpagetest;
import hivcmstestcase.testbase;

		
	public class Hivdashpage extends testbase{
		
	  public Hivdashpage (WebDriver driver){ 
    	 this.driver=driver;
	    PageFactory.initElements(driver, this);
}

		@FindBy(xpath=("//a[contains(text(),'Home')]"))
		WebElement WHOBOOKINTRO; 
		
		@FindBy(xpath="//a[contains(text(),'WHO HTS INFO')]")
		WebElement WHOBOOK;
		
		@FindBy(xpath="//a[contains(text(),'Add child page')]")
		WebElement ADDPage;
		
		@FindBy(id="edit-title")
		WebElement ADDContent;
		
		// To implement radio button  Merge 1
		
		@FindBy(xpath="//input[@type='radio']")
		List <WebElement> Menusqaure;
		
		@FindBy(id="edit-submit")
		WebElement Savepage;
		
		public Hivdashpage firstpage() throws InterruptedException{	
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			WHOBOOKINTRO.click();
			return hivdashpage;
		}
		public Hivdashpage dashwait() throws InterruptedException {
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			Thread.sleep(3000);
			return hivdashpage;
			
		}
		
		public Hivdashpage bookopen(){
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			WHOBOOK.click();
			return hivdashpage;
		}
	
		public Hivdashpage addpage(){
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			ADDPage.click();
			return hivdashpage;
		}
		public Hivdashpage addcontent(){
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			 ADDContent.sendKeys("Files & Concepts");
			return hivdashpage;
		}
		
		// To implement radio button  dff
		
		public Hivdashpage selectcontent(){
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			Menusqaure.get(1).click();
			System.out.println("list of options=  " + Menusqaure.size());
			return hivdashpage;
			
		}  	
		
		public Hivdashpage savepage(){
			hivdashpage = new Hivdashpage (driver); 
			PageFactory.initElements(driver, Hivdashpage.class );
			 Savepage.click();
			return hivdashpage;
		}	 
	
		// Connectivity scenario for next page and ensure class name [Navigation Purpose]
		
		public Newchildpage move_tochildpage() throws InterruptedException {
			newchildpage = new Newchildpage (driver); 
			PageFactory.initElements(driver, Newchildpage.class );
			Thread.sleep(3000);
			return newchildpage;
		}
		
	}