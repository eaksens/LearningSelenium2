package abstractClass;

public class Test {
	public static void main(String[] arg) {
		//with the help of child class, we will be able to call the concrete method of the abstract class
		ChildFirefox c = new ChildFirefox();
		c.captureScreenshot();
		
		/*
		 * why java does not allow us to create the object of the abstract class?
		 * because if you called abstract method in that abstract class
		 * those abstract methods do not have any implementations in them -THEN DO WHAT???
		 */
	}

}
