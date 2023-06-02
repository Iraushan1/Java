package Array;

import java.util.Arrays;

public class AlternateDigit {
	public static void alternateDigit(int arr[]) {
		int arr1[]=new int[arr.length];
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
	 			}
			}
		}
		for(int i=0; i<arr.length/2; i++) {
			temp=arr[i];
			if(i%2==0) {
				arr1[i]=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(arr1));
	}
}
