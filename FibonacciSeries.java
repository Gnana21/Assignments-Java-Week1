package Java.assignments.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
         //0, 1, 1, 2, 3, 5, 8, 13
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		// Print first number
		// Iterate from 1 to the range
		// add first and second number assign to sum
		// Assign second number to the first number
		// Assign sum to the second number		
		// print sum
		
		int firstNum = 0, secNum = 1, sum;
		
		System.out.println("Fibonacci Series:");
		
		System.out.print(firstNum + ", ");
		 
		for(int i = 0; i <6; i++) {
			
			sum = firstNum + secNum;
			firstNum = secNum;
			 secNum= sum;
			
		     System.out.print(sum + ", ");
		}
	}
	

}
