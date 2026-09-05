package com.tnsif.multipleinh;

public class BankDemo {

	public static void main(String[] args) {
		StudentSavingAccount s = new 	StudentSavingAccount();
		s.accountHolder = "Lekha";
		s.balance =20000;
		s.interestRate =5.5;
		s.discount = 2;
		
		s.displayAccountDetails();
		s.dispalySavingDetails();
		s.displayStudentSavingDetails();

	}

}
