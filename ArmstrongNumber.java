package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153, temp, rem, sum = 0;
		temp = num;

		while (temp != 0) {
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}

		if (sum == num) {
			System.out.println(num + " is a ArmstrongNumber");
		} else {
			System.out.println(num + " is not a ArmstrongNumber");
		}
	}
}
