
public class WhileLoop {
	/*
	 * When to use while loop?
	 * Ans: Do not know the number of iteration 
	 * (if there is the dynamics ranking)
	 * 
	 */
	
	
	public static void main(String[] arg) {
		int i=12;
		while(i<=10) ;
		{
			System.out.println(i +" do... while loop");
			i++;
		}	
		
		do {
			System.out.println(i +" while loop");
			i++;
		}while(i<=10);
		/*
		 * do the statement always before check the while condition
		 */
		System.out.println("After Loop");
	}
}
