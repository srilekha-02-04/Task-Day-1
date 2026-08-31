package day2;

public class Amstrong {

	public static void main(String[] args) {
		int n = 153;
		int a = n % 10;
		int b = (n / 10) % 10;
		int c = n / 100;

		int sum = a*a*a + b*b*b + c*c*c;

		if (sum == n)
		    System.out.println("Armstrong");
		else
		    System.out.println("Not Armstrong");

	}
	

	}


