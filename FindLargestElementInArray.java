package assignments.java.week1;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = { 23, 343, 45, 23, 7, 8, 99, 63 };

		int lengthArr = arrNum.length;
		System.out.println("Length of the given Array is " + lengthArr);

		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
		}

		Arrays.sort(arrNum);
		System.out.println("Sorting the given Array");
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
		}
		System.out.println("Smallest Element in the  Array is "+arrNum[0]);
		System.out.println("Largest Element in the  Array is "+arrNum[arrNum.length-1]);
		System.out.println("Seccond Largest Element in the Array is "+arrNum[arrNum.length-2]);
		
	}
}