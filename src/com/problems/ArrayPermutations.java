package com.problems;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
	
	
	private static void generatePermutations(int[] arr, List<Integer> list, List<List<Integer>> combinations, boolean[] freq) {

		if(list.size()==arr.length) {
			
			if(list.size()>0)
				combinations.add(new ArrayList<>(list));
			
			return;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(!freq[i]) {
				freq[i] = true;
				list.add((Integer)arr[i]);
				generatePermutations(arr, list, combinations, freq);
				list.remove((Integer)arr[i]);
				freq[i] = false;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3};
		
		List<Integer> list = new ArrayList<>();
		
		List<List<Integer>> combinations = new ArrayList<>();
		
		boolean[] freq = new boolean[arr.length];
		
		generatePermutations(arr, list, combinations, freq);
		
		System.out.println(combinations);
		

	}

	

}
