package Java.assignments.week1;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		
		// Declare your input as 5
				// Declare an integer variable fact as 1
				// Iterate from 1 to your input (tip: using loop concept)
					// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
				//End of loop
				// Print factorial (fact)
		
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			 fact = fact * i;
			
			System.out.println("Factorial of "+ num +" is " + fact);
		
	}

}
	
}
