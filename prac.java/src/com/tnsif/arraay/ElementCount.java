package com.tnsif.arraay;

public class ElementCount {

	public static void main(String[] args) {
		int[] nums = {65,32,70,65, 70,10,65};
		int element = 65;
		int count = 0;
		
		for(int i = 0 ; i < nums.length; i++) {
			if(nums[i] == element) {
				count++;
			}
		}
		System.out.println("Element :" + element);
		System.out.println("Number of occurrences:" + count);

	}

}
