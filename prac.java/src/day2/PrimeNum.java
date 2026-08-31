package day2;

public class PrimeNum {

	public static void main(String[] args) {
		for (int n = 2; n <= 100; n++) {
		    int i;
		    for (i = 2; i < n; i++)
		        if (n % i == 0) break;

		    if (i == n)
		        System.out.print(n + " ");
		}
	}

}
	


