package sep1ed;

import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {
	
	  static int duplicateArray(int arr[], int n) {
	        int j = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                arr[j++] = arr[i];
	            }
	        }
	        arr[j++] = arr[n - 1];
	        return j;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size :");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Output" + Arrays.toString(arr));

	        Arrays.sort(arr);
	        int j = 0;
	        j = duplicateArray(arr, n);
	        for (int i = 0; i < j; i++) {
	            System.out.println(arr[i]);
	        }
	}

}
