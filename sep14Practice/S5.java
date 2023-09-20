package sep14Practice;

import java.util.Scanner;

//5.	1 9 25 49 ....n

public class S5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		
	    int l = sc.nextInt();
	    
	    for(int i=1;i<=l;i++) {
	    	
	    	if(i%2==1) {
	    		System.out.print((i*i) + " ");
	    	}
	    	
	    }
	}

}
