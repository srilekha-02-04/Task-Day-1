package day2;

public class Sumprime {

	public static void main(String[] args) {
		int count=0;
		int sum =0;
		for(int n =2; count<10;n++) {
			int factors =0;
			for(int i=1;i<=n;i++) {
				if (n%i==0) {
					factors ++;
				}
			}
			if(factors==2) {
				sum=sum+n;
				count++;
			}
			
				
		}
    
	System.out.println("sum of first 10 primenumber="+sum);
	}
}

	


