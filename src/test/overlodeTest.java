package test;

class a {
	public void show() {
		test();
	}
	
	public void test() {
		test();
		System.out.println("Sub");
	}
}

class b extends a{
	
	public void show() {
		super.test();
	}
	
	public void test() {
		System.out.println("String");
	}
}

public class overlodeTest{
	public static void main(String[] args) {
		a a1 = new a();
		a1.show();
	}

}
