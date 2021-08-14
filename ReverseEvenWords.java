package assignments.java.week1;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    /* Declare the input as Follow String test = "I am a software tester"; 
		 * a) split the words and have it in an array 
		 * b) Traverse through each word (using loop)
		 * c) find the odd index within the loop (use mod operator) 
		 * d)split the words and have it in an array 
		 * e)print the even position words in reverse order
		 * using another loop (nested loop) 
		 * f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).	 */
	

		String test = "I am a software tester";

		String[] testNew = test.split(" ");

		// System.out.println(Arrays.toString(testNew));

		for (int i = 0; i < testNew.length; i++) {

			if (i % 2 != 0) {
				
				for (int j = testNew[i].length()-1; j >= 0; j--) {
				
					System.out.print(testNew[i].charAt(j));								
				   }			
				System.out.print(" ");
				}
			else {
				
				System.out.print(testNew[i]+ " ");	
				//System.out.print(" ");
			}
		}
	}

}
