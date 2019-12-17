package polymorpism;

public class HSBC extends RBI {

	public static void main(String[] args) {

		HSBC obj = new HSBC();
		//if method getHomeLoanROI() is not there on the child class 
		//then call the parent class
		System.out.println(obj.getHomeLoanROI());		

	}
	
	//overriding the method in the parent RBI class
	public double getHomeLoanROI() {
		return 13.33;
	}
	/*
	 * Overriding is the runtime polymorphism
	 * Overriding /dynamic binding /late binding /runtime polymorphism
	 * 
	 */

}
