package encapsulation;

public class ATM {
 public static void main(String[] args) {
	 Bank obj = new Bank();
	/*
	 * this updated the pinNo to be 2222 
	 * -we should not be able to access this outside the class
	 * obj.pinNo = 2222; 
	 * same as account number
	 */
	 //withdraw where pinNo is 2222
	 obj.withdrawAmount(123456, 2222, 1000000000);
	 
	 //update pinNo from 1234 to 2222
	 obj.updatePin(123456, 1234, 2222);
	 
	 //Then, withdraw again with pinNo 2222
	 obj.withdrawAmount(123456, 2222, 23);
	 
 }
}
