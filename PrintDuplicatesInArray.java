package assignments.java.week1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int arrLength = arr.length;

		for (int i = 0; i < arr.length - 1; i++) {
			
			int count = 0;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] == arr[i])
				{
					count++;
				}
			}
			
			if (count>0) {
				System.out.println("The Duplicate number is " + arr[i]);
				
			}
		}
	}

}
