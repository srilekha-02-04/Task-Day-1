package com.tnsif.arraay;

public class LargeElement {

	public static void main(String[] args) {
		int[] nums = {2,5,7,20,80};
		int largest = nums[0];
		for(int i=1;i<nums.length; i++) {
			if(nums[i]>largest) {
				largest = nums[i];
			}
		}
		System.out.println("Largest element=" + largest);

	}

}
