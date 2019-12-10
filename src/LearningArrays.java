
public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emp1 = 5000;
		int emp2 = 6000;
		
		int emp10 = 1000;
		
		//create an array salary which storing above data into 1 variable
		int[] salary;
		salary = new int[10]; //10 is size of array
		
		//initialize the array
		String month[] = {"Jan","Feb","March"};
		//print the 1st element of array month
		System.out.println(month[0]);
		
		System.out.println(month.length);
		
		
		for(int i=0;i<month.length; i++) {
			System.out.println(month[i]);
		}
		
		
	}

}
