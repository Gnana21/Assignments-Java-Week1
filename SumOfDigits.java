package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123, rem, sum =0;
		
		while(num != 0) {
			
			rem = num%10;
			sum = sum + rem;
			num = num/10;
				
		}
		System.out.println("Sum of digits is " + sum );
	}

}
