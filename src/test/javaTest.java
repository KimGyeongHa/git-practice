package test;

public class javaTest {
	
	class A{
		int a = 0;
		int b = 0;
	}
	
	public static void main(String[] args) {
		int result = 0;
		int a = 100;
		for(int i=0;i<3;i++) {
			result  = a >> i;
			result = result + 1;
		}
		System.out.println(result);
	}
}
