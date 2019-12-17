package polymorpism;

public class CITI extends RBI{

	public static void main(String[] args) {
		
		CITI obj = new CITI();
		/*
		 * This is overriding perform when parents is not able to 
		 * fulfill functionality of a child class.
		 */
		System.out.println(obj.getHomeLoanROI());
		
		obj.getCarLoanROI();
	}
	
	//this is override the method from the RBI parent class
	public double getHomeLoanROI() {
		return 10.96;
		
	}

}