package pckg4;

import pckg3.Test;

public class Sample extends Test {
	
	/*
	 * Inheritance -one class object will inherit other class properties
	 * extends, implements
	 * A, B
	 * A extends B -> B is a parent class of A
	 * 
	 */

	public static void main(String[] args) {
		Sample obj = new Sample();
		System.out.println(obj.publicVariable);
		//System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
		//System.out.println(obj.defaultVariable);
		
		Sample s = new Sample();
		System.out.println(s.publicVariable); //only possible when there is an Inheritance 

	}

}
