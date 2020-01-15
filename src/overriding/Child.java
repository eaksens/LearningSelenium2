package overriding;

public class Child extends Parent {
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.add();
		c.subtract();
		c.multiply();
	}
}
