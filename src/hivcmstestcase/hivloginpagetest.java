package hivcmstestcase;

import org.testng.annotations.Test;

public class hivloginpagetest extends testbase{
	
	// Enable the continuity of the flow 
	
	@Test
	public void user () throws InterruptedException {
    	hivloginpage.verify_login();
	}
}