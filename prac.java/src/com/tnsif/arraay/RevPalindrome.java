package com.tnsif.arraay;

public class RevPalindrome {

	public static void main(String[] args) {
		

		        String word = "ANNA";
		        String reverse = "";

		        for (int i = word.length() - 1; i >= 0; i--) {
		            reverse = reverse + word.charAt(i);
		        }

		        System.out.println("Original word: " + word);
		        System.out.println("Reversed word: " + reverse);

		        if (word.equals(reverse)) {
		            System.out.println("The word is a palindrome.");
		        } else {
		            System.out.println("The word is not a palindrome.");
		        }
		    }
		

	}


