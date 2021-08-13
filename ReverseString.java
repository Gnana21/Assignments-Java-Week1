package assignments.java.week1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "feeling good";
		
		char[] testArray = test.toCharArray();

		for (int i = testArray.length-1; i >= 0; i--) {
			System.out.print(testArray[i]);
		}
		
	}

}
