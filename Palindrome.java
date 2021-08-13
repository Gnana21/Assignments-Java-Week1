package assignments.java.week1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "madam";
		String 	revValue = "";
		
		for (int i = value.length()-1; i >=0 ; i--) {
			revValue = revValue + value.charAt(i);
			
		}
		
		if (value.equalsIgnoreCase(revValue)){
			System.out.println("The give string is Palindrome");
		}
		
		else {
			System.out.println("The give string is not a Palindrome");
		}
	}

}
