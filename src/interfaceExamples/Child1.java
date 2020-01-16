package interfaceExamples;

public class Child1 implements Parent1, Parent2{

	@Override
	public void show() {
		//Provide definition to show90 method
		System.out.println("Child show()");		
	}

}
