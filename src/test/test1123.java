package test;

import java.io.BufferedInputStream;

public class test1123 {
	
	static int[] answerList(int[] answerList) {
		int[] temp = answerList;
		
		for(int i=1; i<answerList.length; i++) {
			if(answerList[i] > answerList[i+1]) temp[i] = 0;	
		}
		
		
		return temp;
	}
	
	
	
	public static void main(String[] args) {
		BufferedInputStream sbi = new BufferedInputStream(System.in);
		
		int num = Integer.parseInt(sbi.toString());
		int[] temp  = new int[num];
		
		
		for(int i=0; i<num; i++) {
			temp[i] = Integer.parseInt(sbi.toString());
		}
		
		answerList(temp);
		
	}
	
}
