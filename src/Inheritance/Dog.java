package Inheritance;

//child class
public class Dog extends Animal{
	
	public static void main(String[] arg) {
		
		//have to initialize the object of Child class, not animal class
		//In this case, initialize the Dog object
		Dog obj = new Dog(); //Dog is generating the sound, NOT animal
		obj.sound();
	}

}
