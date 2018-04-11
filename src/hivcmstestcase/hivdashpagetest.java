package hivcmstestcase;

import org.testng.annotations.Test;

public class hivdashpagetest extends testbase{
	
	@Test 
	
	public void verifydashpage () throws InterruptedException {
		hivloginpage.verify_login().move_todashboard().bookopen().addpage().addcontent().selectcontent().savepage();
	}
	
	
}
							