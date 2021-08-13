package Java.assignments.week1;

public class PrimeNumber {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		// Declare a boolean variable flag as false
		// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder
		// break the iterator
		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match

		int num = 13;
		boolean flag = false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num % i);
				flag = true;
				break;	
			}
		}
		if (flag== false)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " not a Prime Number");
	}

}
