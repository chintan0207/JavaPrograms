package oct10domainAssessment;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySecondSmallest {
	
	public static int getSecondSmallest(int arr[]){
		
	
		if(arr.length < 2) {
			throw new IllegalArgumentException("Array should have atleast two elements");
		}
		
		int temp;
		for(int i=0; i<arr.length; i++)
		{
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				
			}
		}
		
		}
//		Arrays.sort(arr);
		
		
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {23,45,32,22,20,96,10};
		System.out.println(getSecondSmallest(a));
	}

}
