package sep1ed;

public class Demo2 {

	public static void main(String[] args) {
		
		//array declaration
	   //array size fix
		
		int a[] = new int[5];
		
		a[0]=100;
		a[2]=200;
		a[3]=300;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//access the elements using specific index number
		System.out.println(a[4]);
		

	}

}
