package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_c {
	
	@Test 
	public void A() {
		System.out.println("A");
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods="A")
	public void B() {
		System.out.println("B");
	}
	@Test
	public void C() {
		System.out.println("C");
	}	
	@Test
	public void D() {
		System.out.println("D");
	
	}

}
