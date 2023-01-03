package test;

import java.util.*;


public class findChar {
	
	public int[] solution(String sentence,char checkChar){
		int[] answer = new int[sentence.length()];
		int temp = 1;
	  	
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == checkChar) {
				answer[i] = 0;
				temp = 1;
			}else {
				answer[i] = temp;
				temp++;
			}
		}
		
		for(int j= sentence.length()-1;j>=0;j--) {
			if(sentence.charAt(j) == checkChar) {
				answer[j] = 0;
				temp = 1;
			}else {
				answer[j] = temp;
				temp++;
			}
		}
		
		
		
	    return answer;
	  }
	  public static void main(String[] args){
	    Scanner sentence =new Scanner(System.in);
	    
	    findChar ma = new findChar();
	    int[] count = ma.solution(sentence.nextLine().toLowerCase(), sentence.next().toLowerCase().charAt(0));

	    for(int a: count) {
	    	System.out.print(a);
	    }
	    
	  }

}
