package week1.day2;

public class MyMobile {

	int screenSize = 12;
	float amps = 4.5f;

	/*
	 * Classroom session: - Create package name as week1.day2 - Create a new class
	 * as "void" under week2.day1 - Create 2 public methods (makeCall() , sendMsg())
	 * with simple print statement - Create a private method payBills() with simple
	 * print statement - Create main method - Create object for Mobile class and
	 * call the methods using the object - Execute the class and get the result in
	 * console
	 */

	public static String makeCalls() {
		String callMsg = "Hello";
		System.out.println("Making calls");
		return callMsg;

	}

	public static void sendMessage() {
		System.out.println("sendMessage");
	}

	private static void payBills() {
		System.out.println("payBills");
	}

	public static void main(String[] args) {

		MyMobile obj1 = new MyMobile();
		obj1.makeCalls();
		obj1.sendMessage();
		obj1.payBills();

	}

}
