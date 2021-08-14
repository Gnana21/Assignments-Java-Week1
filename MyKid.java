package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMobile kidObj = new MyMobile();
		
		float amps = kidObj.amps;
		System.out.println("Amps of My Mobile is " + amps);

		kidObj.makeCalls();
		kidObj.sendMessage();
		//kidObj.payBills(); -- As the access modifier is private the method payBills() can't be accessed out of the class where its created. 
		
		String kidMsg = kidObj.makeCalls();
				System.out.println(kidMsg);
	}

}
