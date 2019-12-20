package com.ctci.bigo;

public class BigO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 13, 27, 35, 40, 49, 55, 59 };
		int[] b = { 17, 35, 39, 40, 55, 58, 60 };
		findCommonElements(a, b);
	}
	
	
	
	static void findCommonElements(int[] arrayA, int[] arrayB ) {
		int k = 0;
		
		for(int i = 0; i< arrayA.length; i++) {
			for(int j = k; j< arrayB.length; j++) {
				if(arrayB[j] == arrayA[i]) {
					k = j+1;
					System.out.println(arrayA[i]);	
				}
			}
		}
	}

}
