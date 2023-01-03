package test;

public class replaceTEST {
	
	public static void main(String[] args) {
		String a = "-";
		String b = "";
		String c = "";
		
		b = a.substring(0,1).replaceAll("-", "");
		if(b.equals(""))System.out.println("sibal");
	}

}
