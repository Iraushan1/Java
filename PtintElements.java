package array;

import java.util.Arrays;
import java.util.Scanner;
public class PtintElements {
	public static void printArray(int arr[]) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		printArray(arr);
		String s=Arrays.toString(arr);
		System.out.println(s);
	}
}
