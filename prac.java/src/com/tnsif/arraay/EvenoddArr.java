package com.tnsif.arraay;

public class EvenoddArr {

	public static void main(String[] args) {
		int[] nums = {7,3,2,8,10};
		System.out.println("Even numbers:");
		for (int i = 0; i<nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
		System.out.println("Odd numbers:");
		for (int i =0; i<nums.length; i++) {
			if(nums[i] % 2 !=0) {
				System.out.println(nums[i]);
			}
				
		}

	}

}
