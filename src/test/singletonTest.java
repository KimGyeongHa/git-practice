package test;

public class singletonTest {
	
	private static singletonTest singleton = new singletonTest();

	
    private singletonTest() {
		
	}
	
	
	public static singletonTest getInstantce() {
		return singleton;
	}
	
}
