package Test_3;

import org.testng.annotations.Test;

public class Test_2 extends Test_1 {

	@Test (groups= "sanity")
	public void BA() {
		System.out.println("test1");
	}
	@Test (groups= "Regression")
	public void BC() {
		System.out.println("test2");
	
}
	@Test (groups= "sanity")
	public void BB() {
		System.out.println("test3");
	}
		
		@Test (groups= "CriticalRegression")
		public void BD() {
			System.out.println("test4");
		}
}