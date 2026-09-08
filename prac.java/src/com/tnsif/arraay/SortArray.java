package com.tnsif.arraay;

public class SortArray {

	public static void main(String[] args) {
		int[] numbers = {22,30,10,4,78,60,2};
		for (int i =0; i<numbers.length;i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i]> numbers[j]) {
					int temp= numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("Array in ascending order:");
		for(int i = 0 ; i <numbers.length; i ++) {
			System.out.println(numbers[i] + " ");
		}

	}

}
