
public class BreakandCont {

	public void go() {
		System.out.println();

		// break is within the loop ONLY
		/*break;
		continue;*/
		
		
		System.out.println("Last");
		
	}

	public static void main(String[] args) {
		/*BreakandCont b = new BreakandCont();
		b.go();*/
		for(int i=0; i<10; i++) {
			
			if(i==5)
				break; //break out from for loop when i is equal to 5
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("Outside For Loop 1");
		
		//continue -continue to the next cycle not running any lines after continue;
		//use of this continue is to skip the iteration
//edited in the edit mode		
	for(int j=0; j<10; j++) {
			
			if(j>=5&&j<=7)
				continue;
			
			System.out.println(j);
			//will print 0 to 4, and skip 5 to 7, then print 8 to 9
		}
		System.out.println("Outside For Loop 2");
		
		for(int k=0; k<12; k++) {
			if(k == 3)
				continue;
			System.out.println(k);
			//will print everything and skip 3
			if(k==7)
				break;
			//print k = 7 then for loop will break and destroy
		}
	///iiiiiii	
		System.out.println("Outside For Loop 3");
	}
}
