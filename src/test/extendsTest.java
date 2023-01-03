package test;

public class extendsTest {
	
	
	
	public static void main(String[] args) {
		
		a test1 = new a();
		b test2 = new b();
		int a = 1;
		
		
		System.out.println(test1.aMethod());
		System.out.println(test2.aMethod() +" "+ test2.bMethod());
		
	
		System.out.println(a<<2);
	
	}
	
	
	static class a{
		
		String aMethod() {
			return "a클래스 메소드";
		}
		
	}
	
	static class b extends a{
		
		
		// 재정의한 메소드를 호출
		@Override
		String aMethod() {
			return "a클래스 메소드 오버라이딩테스트";
		}
		
		String bMethod() {
			return "b클래스 메소드";
		}
		
	}

}
