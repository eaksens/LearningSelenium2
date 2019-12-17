package Inheritance;

//child class
public class Dog extends Animal{
	
	public static void main(String[] arg) {
		
		//have to initialize the object of Child class, not animal class
		//In this case, initialize the Dog object
		Dog obj = new Dog(); //Dog is generating the sound, NOT animal
		obj.sound();
	}
	
	//if there is a sound method here in this class, then it will call this method within this Dog class
	public void sound() {
		System.out.println();
	}
	/*
	 * Interview question:
	 * Why multiple inheritance is not possible?
	 * multiple inheritance is where a child class has 2 parent classes
	 * 
	 * sound() method in this class is OVERRIDE the sound() method 
	 * in Animal parent class
	 * 
	 */

}
