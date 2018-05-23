package hivcmstestcase;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import hivcmspages.Hivdashpage;

public class testexecution{
	
	@Test
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.firefox.dirver","C://Users/Bhuvanesh/Desktop/browserexe/chrome.exe");
    WebDriver driver = new ChromeDriver();
    System.out.println("chrome browser is launched");
    driver.get("https://hiv-cmsdev.adappt.co.uk/user");
    driver.findElement(By.id("edit-name")).sendKeys("adapptadmin");
    driver.findElement(By.id("edit-pass")).sendKeys("@dappt890");
    Thread.sleep(3000);
    driver.findElement(By.id("edit-submit")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(text(),'WHO HTS INFO')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),\"Add child page\")]")).click();
    driver.findElement(By.id("edit-title")).sendKeys("new concept3");
    Thread.sleep(3000);
    
    // To implement radio button 
    
    List <WebElement> Menusqaure= driver.findElements(By.xpath("//input[@type='radio']"));
    Menusqaure.get(1).click();
    System.out.println("list of options=  " + Menusqaure.size());
    driver.findElement(By.id("edit-submit")).click();
   
    // To Check created chapter listing or not
    
   // List <WebElement> Concepts= driver.findElements(By.xpath("//li[@class='leaf']"));
    //Iterator<WebElement> menu=Concepts.iterator();
    //String values=menu.next().getText();
    //if(values.equalsIgnoreCase("new concept3")) {
	  //System.out.println("book title is available ");
  //else {
	  //System.out.println("book title is not available");
      //driver.close();
    
    driver.findElement(By.xpath("//a[contains(text(),'Add child page')]")).click();
    driver.findElement(By.id("edit-title")).sendKeys("info");
    driver.findElement(By.xpath("//body[@spellcheck='false']")).sendKeys("These are the different mechanism to identify the same textbox – by using different attributes such as id, name, className or xpath. Here we have kept just one active & commented the others. For details on different element locators, click here");;
    driver.findElement(By.id("edit-field-icon-und-0-browse-button")).click();
    driver.findElement(By.id("edit-upload-upload")).click();
    // Tags selecting code 
    driver.findElement(By.xpath("//*[@id='edit_field_tagging_und_chosen']/ul")).click();
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
    
    
	}
	 
	
}
