package com.problems;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	
	/*private static String swap(String str, int i, int j) {
		
		char[] ch = str.toCharArray();
		
		char tmp = ch[i];
		ch[i] = ch[j];
		ch[j] = tmp;
		
		return String.valueOf(ch);
	}
	
	private static void  generatePermutation1(String str, int ind, int end) {
		
		
		if(ind==end) {
			System.out.println(str);
			return;
		}
		
		for(int i=ind;i<end;i++) {
			str = swap(str, i, ind);
			generatePermutation1(str, ind+1, end);
			str = swap(str, i, ind);
		}
		
		
		
	}*/
	
	private static void generatePermutations(String str, List<Character> list, List<String> ans, boolean[] freq) {
		// TODO Auto-generated method stub
		if(list.size()==str.length()) {
			
			if(list.size()>0) {
				StringBuffer sb = new StringBuffer();
				for(Character ch:list) {
					sb.append(ch);
				}
				
				ans.add(sb.toString());
			}
			
			return;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			if(!freq[i]) {
				freq[i] = true;
				list.add(str.charAt(i));
				generatePermutations(str, list, ans, freq);
				list.remove(list.size()-1);
				freq[i] = false;
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {

		String str = "abc";
		
		List<Character> list = new ArrayList<>();
		List<String> ans = new ArrayList<>();
		
		boolean[] freq = new boolean[str.length()];
		
		generatePermutations(str, list, ans, freq);
		System.out.println(ans);

		//generatePermutation1(str, 0, str.length());
		
		
	}

}
