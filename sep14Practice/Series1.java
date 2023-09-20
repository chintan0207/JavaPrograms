package sep14Practice;

//1.	1 3 5 7 9 ....n
//2.	1/1 + 1/2 + 1/3 +   + 1/n = ?
//3.  1 8 27 64 ....n
//4.	1/1 + 2/4 + 3/9 + ...n/n = ?
//5.	1 9 25 49 ....n
//6.  1/1 + 2/2 + 3/3 +...+ n/n = ?
//7.	1 4 9 16 25 ....n
//8.	1*2 + 2*3 + 3*4 + ... 15*16 = ?  i*(i+1)
//9.	1-2+3-4+5-6... n = ?
//10.	1/1! + 2/2! +  ... + n/n! = ?

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n:");
		
		int n = sc.nextInt();
		
	    for(int i=1;i<=n;i++) {
	   	
	    	if(i%2==1) {
	    		 System.out.println(i);
	    	}
	     		
	    	
	    }
	       

	}

}
