package test;

public class test123 {
	public static void main(String[] args) {
		child d = new child("test");
		
	}
}
class parent{
	String name= "Parent";
	public parent() {
		System.out.println(this.name);
	}
	
}

class child extends parent{
	public child(String name) {
		System.out.println(this.name);
	}
	
}


