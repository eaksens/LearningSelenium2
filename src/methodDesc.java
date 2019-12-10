
public class methodDesc {
	
	public int display() { //a method cannot have 2 return types
		String mai = "Mai";
		return 3; //return is the last statement
	}
	
	//Variables: Instance (Global), Local, and Class variables
	/*
	 * Instance --- declared class body 
	 * 				can access this thru out the class
	 * Local --- declared inside the method
	 * Class variables ---make particular member as static
	 * 
	 */
	public static void main(String[] arg) {
		//create an object for this class 
		//to call the instance variable from the DataTypes class
		DataTypes dt = new DataTypes();
		dt.instanceVar++; // Object1 --> i =4+1 = 5;
		
		//2nd object reference
		DataTypes dt1 = new DataTypes(); 
		dt1.instanceVar++; // Object2 --> i =4+1 = 5;
		
		//3rd object reference
		DataTypes dt3 = new DataTypes(); 
		int x = dt3.instanceVar;
		System.out.println(x); //Object3 will print x as 4;
		
	}
}
