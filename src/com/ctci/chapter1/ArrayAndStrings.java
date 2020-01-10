package com.ctci.chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
public class ArrayAndStrings {

	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		numUniqueEmails(emails);
	}

	//Given two strings, write a method to 
    //determine if one string is permutation of another string.
	
	
	
	
	// 1. Is Unique: Implement an algorithm to determine if a string
	// has all unique characters. What if you cannot use additional data structure
	//
	static boolean isUnique1(String input) {
		char[] inputChars = input.toCharArray();
		ArrayList<Character> List = new ArrayList<Character>();
		for (char ch : inputChars) {
			if (!List.contains(ch)) {
				List.add(ch);
			} else {
				return false;
			}
		}
		return true;
	}

	//assuming only a-z stores.
	static boolean isUnique2(String input) {
		if (input.length() > 26)
			return false;
		String guessList = "abcdefghijklmnopqrstuvwxyz";
		for (char c : guessList.toCharArray())
			if (input.contains(String.valueOf(c))) {
				input = input.replaceFirst(String.valueOf(c), "");
			}
		
		if(input.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
		static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	
		static int numUniqueEmails(String[] emails) {
			Set<String> hash_Set = new HashSet<String>(); 
	        for(String email:emails){
	            String[] em = email.split("@");
	            String user = em[0];
	            if(em[0].contains("+")){
	                user = user.substring(0,user.indexOf('+'));
	            }
	            
	            user = user.replaceAll(".", "");
	            hash_Set.add(user+"@"+em[1]);
	        }
	        return hash_Set.size();
			
	    }
}
