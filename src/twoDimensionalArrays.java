
public class twoDimensionalArrays {
	
	public static void main(String[] args) {
		int rows = 3;
		int cols = 3;
		
		int table[][] = new int[rows][cols];
		//row from row 0th to row 3rd
		//column from column 0th to column 3rd
		
		//assign values into 0th row
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		
		table[1][0]=20;
		table[1][1]=21;
		table[1][2]=22;
		
		table[2][0]=30;
		table[2][1]=31;
		table[2][2]=32;
		
		//row length
		System.out.println(table.length);
		
		//column length
		System.out.println(table[0].length);
		
		System.out.println(table[0][0]);
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(table[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	//limitation of an array is we need to KNOW the array size to loop in the for loop

}
