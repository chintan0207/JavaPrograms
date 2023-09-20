package sep4ed;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		char ch, choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter two number:");
			
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Enter your Choice.\n + for add \n - for sub \n * for mul\n / for div");
			
			ch = sc.next().charAt(0);
			
			switch(ch) {
			
			case '+': System.out.println("Add :" + (a+b));
			break;
			case '-': System.out.println("sub :" + (a-b));
			break;
			case '*': System.out.println("mul :" + (a*b));
			break;
			case '/': System.out.println("div :" + (a/b));
			break;
			default:System.out.println("Invalid choice");
		}
			System.out.println("Press y to continue");
			choice = sc.next().charAt(0);	
	}while(choice=='y' || choice=='Y');
	}

}
