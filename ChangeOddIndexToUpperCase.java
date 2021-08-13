package assignments.java.week1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		
		char[] tesxtArray = test.toCharArray();
		
		for (int i = 0; i < tesxtArray.length; i++) {
			
			if(i%2!=0) {
				tesxtArray[i]= Character.toUpperCase(tesxtArray[i]);
				System.out.print(tesxtArray[i]);
			}
			
			else {
				System.out.print(tesxtArray[i]);
			}
			
		}
		
		
	}

}
