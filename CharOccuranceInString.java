package assignments.java.week1;

public class CharOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		int count = 0;
		
		char[] strArray = str.toCharArray();
		
		for (int i = 0; i < strArray.length; i++) {
			if(strArray[i] == 'e') {
				count++;
			}	
		}
		System.out.println("The char 'e' occured " + count + " times in the given string");
	}

}
