package Test_3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	
	@Test
	public void Tes_1() {
		
		SoftAssert soft = new SoftAssert ();
		
		System.out.println("Email Enter");
		System.out.println("Passord");
		System.out.println("login button");
		
		String expected="BugSpotter";  // if name spelling was changed in that condition test will show as fail status. 
		String actual="BugSpotter";
		
		soft.assertEquals(actual, expected);
		soft.assertAll();
		System.out.println("tset done");	
		}
	@Test
	public void Test_2() {
		System.out.println("Test_2");
		
		
		
		
	}
	

}
