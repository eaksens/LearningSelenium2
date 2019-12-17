package polymorpism;

public class OverloadingExample {
	/*
	 * method should be in the same class
	 */
	
	public static void main(String[] args) {
		OverloadingExample obj = new OverloadingExample();
		obj.add(10.023, 11);
		obj.add(1, 2, 3);
		System.out.println();
		
	}
	
	public void add(double a, int b) {
		
	}
	
	//same name of the method -called "Overloaded" 
	/*
	 * Overloaded method -same name, same signature; but different arguments type
	 */
	public void add(int a, int b, int c) {
		
	}
	
	public void add(byte a, byte b) {
		
	}
	
	public void add(int a, double b) {
		
	}
	
	public void doLogin(String username, String password) {
		
	}
	
	public void addition(int... a) {
		//varargs = variable arguments
		int[] var = a;
		
	}
	
	/*
	 * Interview Question:
	 * Can we achieve overloading by keeping the method signature same
	 * and changing the return type
	 * Answer: No
	 * Can we overload the main method of java, yes, but the signature would be different...?
	 * 
	 */
	
	
}
