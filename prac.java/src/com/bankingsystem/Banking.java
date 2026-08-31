package com.bankingsystem;
import java.util.Scanner;
public class Banking {



	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("===== WELCOME TO BANKING SYSTEM =====");

	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Account Number: ");
	        long accountNumber = sc.nextLong();

	        System.out.print("Enter Initial Deposit Amount: ");
	        double balance = sc.nextDouble();

	        System.out.println("\nAccount Created Successfully!");

	        System.out.println("Customer Name: " + name);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: " + balance);
	        System.out.print("Enter amount to deposit: ");
	        double depositAmount = sc.nextDouble();

	        if (depositAmount > 0) {
	            
	            balance = balance + depositAmount;
	            
	            System.out.println("Amount Deposited Successfully!");
	            System.out.println("Current Balance: " + balance);
	            
	        } else {
	            
	            System.out.println("Invalid Deposit Amount!");
	        }
	        System.out.print("Enter amount to withdraw: ");
	        double withdrawAmount = sc.nextDouble();

	        if (withdrawAmount > 0 && withdrawAmount <= balance) {

	            balance = balance - withdrawAmount;

	            System.out.println("Withdrawal Successful!");
	            System.out.println("Current Balance: " + balance);

	        } else {

	            System.out.println("Insufficient Balance or Invalid Amount!");
	        }
	        

	        sc.close();
	    
	}
}


