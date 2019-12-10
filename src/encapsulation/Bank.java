package encapsulation;

public class Bank {
	/*
	 * Encapsulation:
	 * 1. Always make instance variable private. 
	 * 2. Always make public accessor methods and force calling code 
	 *    to use these methods instead of directly calling the instance variables. 
	 * 3. Use naming convention set() and get() for these methods.
	 */
	private int accountNo=123456;
	private int pinNo=1234;
	public double balanceAmount=1000000;
	
	
	
	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	//setter is void as the method is not returning you anything
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public void withdrawAmount(int accNo, int pin, int amount) {
		if(accNo == accountNo && pin ==pinNo) {
			if(amount<=balanceAmount) {
				balanceAmount = balanceAmount-amount;
				System.out.println("Amount withdrew is " + amount);
			}else {
				System.out.println("Insufficient Amount !");
			}
		}else {
			System.out.println("Invalid Credentials !");
		}
	}
	
	//create the getter and setter to make change with the PIN number, it has to be some validation
	//What do we need to update the PIN? -accNo, oldPin, newPin
	public void updatePin(int accNo, int oldPin, int newPin) {
		if(accNo==accountNo&&oldPin==pinNo) {
			pinNo = newPin;
			System.out.println("Pin changed successfully!!!");
		}else {
			System.out.println("Invalid Credentials!");
		}
	}

}
