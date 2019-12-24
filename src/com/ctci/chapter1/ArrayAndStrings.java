package com.ctci.chapter1;

import java.util.ArrayList;
public class ArrayAndStrings {

	public static void main(String[] args) {
		boolean output = isUnique2("helaoss");
		System.out.println(output);
	}

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
}
