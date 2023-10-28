package oct21;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		
		String str = sc.next();
		
		// meena
		// [m e n a] []
		
		char c[] = str.toLowerCase().toCharArray();
		int freq[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(c[i]==c[j])
				{
					freq[i]++;
					c[j]='0';
				}
			}
			
		}
		System.out.println("Frequency of character are:");
		for(int i1=0; i1< freq.length;i1++)
		{
			if(c[i1] !='0') {
				System.out.println(c[i1] + " " + freq[i1]);
			}
		}
		
		
	}

}
