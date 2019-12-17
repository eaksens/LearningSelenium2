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
	
	//return type of classname
	//Method to get the objects of this class
	public HSBC getOj() {
		return 
	}
	
	/*
	 * Overriding is the runtime polymorphism
	 * Overriding /dynamic binding /late binding /runtime polymorphism
	 * Interview Questions:
	 * Q1: Can we change the return type while performing overriding?
	 * Ans: 
	 * No -when return type are Primitive
	 * Yes -when return type is the ClassName -object
	 */

}
