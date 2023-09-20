package sep1ed;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//jagged array(2 D array)=array within array
		int a[][]= {
			
				{1,3,5},
				{10,30,20,40},
				{8}
		};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
