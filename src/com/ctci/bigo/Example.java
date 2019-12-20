package com.ctci.bigo;

public class Example{
	
	
	void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for(int i = 0; i< array.length; i++) {
			sum += array[i];
		}
		
		for(int i = 0; i< array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + ", "+product);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//==================================================================
	void printPairs(int[] array) {
		for(int i = 0; i< array.length; i++) {
			for(int j = 0; j< array.length; j++) {
				System.out.println(array[i]+ ", "+ array[j]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	//==================================================================
	void printUnorderedPairs(int[] array){
		for(int i = 0; i< array.length; i++) {
			for(int j = i+1; j< array.length; j++) {
			System.out.println(array[i] + ", " + array[j]);	
			}
		}
	}
	
	
	
	
	
	
	
	
	
	//==================================================================

	void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayA.length; j++) {
			}
		}
	}
	
	
     
}
