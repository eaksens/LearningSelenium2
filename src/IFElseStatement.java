
public class IFElseStatement {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*5); //integer random numbers from 0 to 4
		System.out.println(num);
		
		if(num>10) {
			System.out.println(num+" is greater than 10");
		}
		else if(num>10&&num<15) {
			System.out.println(num+" is in between 10 and 15");
		}
		else {
			System.out.println(num + " is less than 10");
		}
	}
}
