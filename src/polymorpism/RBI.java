package polymorpism;

public class RBI {
	
	
	
	//method signature is method name + method parameters
	public void getHomeLoanROI(int amount, String bankName) {
		
	}
	
	/* Overloading -> having multiple method with the same name
	 * but different method signature (different parameters)
	 */
	public void getHomeLoanROI(String bankName, int amount) {
		
	}
	
	public void getHomeLoanROI(int amount) {
		
	}
	
	public double getHomeLoanROI() {
		return 8.5;
	}
	
	public double getCarLoanROI() {
		return 10.5;
	}

}
