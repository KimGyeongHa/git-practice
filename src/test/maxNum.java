package test;

import java.util.*;

public class maxNum {
	
	public List<Integer> result(List<Integer> numValues) {
		List<Integer> answer = new ArrayList<>();
		String temp = "";
		for(int i=0 ; i< numValues.size()-1; i++) {
		
			if(numValues.get(i) <= numValues.get(i+1)) {
				answer.add(numValues.get(i+1));
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		maxNum mn = new maxNum();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> temp = new ArrayList<>();
		for(int i = 0; i < num ; i++) {
			temp.add(sc.nextInt());
		}
		
		List<Integer> test = mn.result(temp);
		
		for(int a : test) {
			System.out.print(a + " ");
		}
	
	}
	

}
