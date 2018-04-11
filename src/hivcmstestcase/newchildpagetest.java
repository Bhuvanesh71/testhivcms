package hivcmstestcase;

import org.testng.annotations.Test;

import hivcmspages.Newchildpage;

public class newchildpagetest extends testbase{
	
	@Test
	
	public void newchildpagetest () throws InterruptedException {
		hivloginpage.verify_login().move_todashboard().bookopen().addpage().addcontent().selectcontent().savepage().move_tochildpage().newchildpage().childpagetitle().imageupload();
	
	}
}
