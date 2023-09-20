package aug30ed;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll no:");
		
		int rollno = sc.nextInt();
		
		System.out.println("Enter Student Name:");
		
		String stuName = sc.next();
		
		System.out.println("Enter Marks for Maths");
		
		int Maths = sc.nextInt();	
		
		System.out.println("Enter Marks for English");
		
		int English = sc.nextInt();
		
        System.out.println("Enter Marks for Hindi");
		
		int Hindi = sc.nextInt();
		
		int Total = Maths + English + Hindi;
		
		double avg = Total/3;
		
		System.out.println("Student roll no:"+rollno+"\nStudent name :"+stuName+
				"\nTotal is:"+Total+"\nAverage is:"+avg
				);
		
		if(avg>=90) {
			System.out.println("A grade");
		}
		else if(avg>=70) {
			System.out.println("B grade");
		}
		else if(avg>=50) {
			System.out.println("c grade");
		}
		else if(avg>=35) {
			System.out.println("D grade");
		}
		else {
			System.out.println("fail");
		}
				
		}

}
