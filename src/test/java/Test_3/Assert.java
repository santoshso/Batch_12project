package Test_3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assert {
	
	
	@Test
	public void Tes_1() {
		System.out.println("Email Enter");
		System.out.println("Passord");
		System.out.println("login button");
		
		String expected="BugSpotter";
		String actual="BugSpotter";  //if name spelling was changed in that condition test will show as fail status. 
		
		assertEquals(actual, expected);
		
		System.out.println("tset done");	
		}
	@Test
	public void Test_2() {
		System.out.println("Test_2");
		
	}
	
	
}
