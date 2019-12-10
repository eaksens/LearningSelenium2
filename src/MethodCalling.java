public class MethodCalling {
	
	/*
	 * static component --> cannot give a call to non-static component
	 * non-static --> non-static
	 * static --> static
	 * non-static component cannot be called without object is being created
	 * 
	 * Write the code:
	 * 1. Compile
	 * 2. Execute -give to JVM 
	 * 
	 */
	
	public static void main(String[] arg){
		//go3();
		MethodCalling mc = new MethodCalling();
		mc.go1();
		System.out.println("after calling go1 method");
		//go3();
		/*
		 * 
		 * Inside Go1 Method
		 * Inside Go Method
		 * Inside Go2 Method
		 * after calling go2 Method
		 * after calling go method
		 * after calling go1 method
		 * 
		 */
	}
	
	public void go() {
		System.out.println("Inside Go Method");
		go2();
		System.out.println("After calling go2 Method");
	}
	
	public void go1() {
		System.out.println("Inside Go1 Method");
		go();
		System.out.println("after calling go method");
	}
	
	public void go2() {
		System.out.println("Inside Go2 Method");
	}
	
	public static void go3() {
		System.out.println("Inside Go3 Method");
	}
	
	
	
	
}
