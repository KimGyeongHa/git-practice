package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class testjava {
	public void a() {
		System.out.println("1");
	}
	
	public void b() {
		System.out.println("2");
	}
	
	public testjava(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		testjava aa = new testjava(5);
		aa.a();
		aa.b();
		
	}

}
