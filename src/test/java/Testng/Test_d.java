package Testng;

import org.testng.annotations.Test;

public class Test_d {
	private static final boolean Faluse = false;
	@Test(priority=0)
	public void A() {
		System.out.println("A");
	}
	@Test(priority=3,invocationCount=3)
	public void B() {
		System.out.println("B");
	}
	@Test(priority=4)
	public void C() {
		System.out.println("C");
	}	
	@Test(priority=2,enabled = Faluse)
	public void D() {
		
		System.out.println("D");
	
	}

}
