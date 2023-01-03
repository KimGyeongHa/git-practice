package test;


public class test2 {
	static int func(int a) {
		if(a <= 1) return 1;
		return a * func(a - 1);
	}
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println(func(a));
	}
}
