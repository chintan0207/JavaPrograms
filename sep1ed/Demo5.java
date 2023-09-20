package sep1ed;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of row");
		
		int row = sc.nextInt();
		
        System.out.println("Enter the numbers of col");
		
		int col = sc.nextInt();
		
		int[][] multiD = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				multiD[i][j] = (i+1) * (j+1);
				
				
			}
		}

		for(int i=0; i<row; i++) {
			for(int j=0;j<col;j++) {
				System.out.print(multiD[i][j]+" ");
		
			}
			System.out.println();
			
		}
	}

}
