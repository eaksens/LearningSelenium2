
public class Calculator {

	// java library is collection of classes to use the
	// CTRL + SHIFT + F -> to format the code
	int x, y;
	
	public Calculator() { // constructor is like a method
		System.out.println("Calling constructor");
	}

	public int add(int x, int y) {
		System.out.println("Adding some numbers");
		return x+y;
	}

	public int subtract(int x, int y) { //method name has to verb
		System.out.println("Subtracting some numbers");
		return x-y;
	}

	public int div(int x, int y) {
		System.out.println("Div some numbers");
		return x/y;
	}

	public int mul(int x, int y) {
		System.out.println("Muliplying some numbers");
		return x*y; 	
	}

	public static void main(String[] args) {
		// creating an object new Calculator() of the class Calculator
		//Calculator calc; // -> this is just a reference of name "calc"
		//new Calculator(); // -> this is creating an object
		
		Calculator calc = new Calculator();
		// Object is also a class in java -mother of all class
		// any internal class in java is a child class to

		/*//Below is you have to create an object every times, you calling methods.
		new Calculator().add();
		new Calculator().sub();
		new Calculator().div();
		new Calculator().mul();*/
		calc.add(5, 6);
		calc.sub();
		calc.div(10,2);
		calc.mul(3,3);
		
		//The String class represents character strings. Allstring literals in Java programs, such as "abc", areimplemented as instances of this class. 
		String value = "100"; //if String is a class, then the keyword value is the reference
		
		System.out.println(value.compareTo("100"));
		// constructor cannot be called thru an object of the class without having to
		// call implicitly calling it
		// no need to do calc.Calculator >> cannot do that
	}

	private void sub() {
		// TODO Auto-generated method stub
		
	}

}
