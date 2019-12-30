package polymorpism;

//this is the parent class which method can be reuse 
//if other child class extends to the parent class
public class RBI{
	
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
	
	public RBI getObject() {
		RBI obj = new RBI();
		//return an object -return type will be that className: HSBC
		return obj;
	}
	
	public CITI getObject1() {
		CITI obj1 = new CITI();
		return obj1;
	}
	
	//WebDriver driver = new FirefoxDriver(); -"polymorphic reference"
	public Number show() { //Number is a parent class of Integer
		return 10;
	}

}
