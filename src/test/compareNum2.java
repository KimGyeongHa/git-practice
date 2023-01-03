package test;


import java.util.ArrayList;
import java.util.Scanner;

public class compareNum2 {

	public static ArrayList<Integer> answer(int[] NumValues) {
		ArrayList<Integer> answerList = new ArrayList<>();
		answerList.add(NumValues[0]);
		
		for(int i=0; i < NumValues.length-1; i++) {
			if(NumValues[i] < NumValues[i+1]) answerList.add(NumValues[i+1]);
		}
		
		
		return answerList;
	}
	
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int cnt = Integer.parseInt(sc.next());
		int[] NumValues = new int[cnt];
		for(int i=0;i<cnt ; i++) {
			NumValues[i] = Integer.parseInt(sc.next());
		}
		
		ArrayList<Integer> answer = answer(NumValues);
		
		for(int val : answer) {
			System.out.print(val + " ");
	
		}
	}
}
