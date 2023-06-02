package Array;

//Median of the subArray which is equal to k'th elements

import java.util.ArrayList;
import java.util.Scanner;
public class MeanOfSubArray {	
	public static void print(int arr[], int k) {
		ArrayList<Integer> al = null;
		int count=0;
		for(int i=0; i<arr.length-1; i++) {
			al = new ArrayList<>();
			al.add(arr[i]);
			count = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(al.get(count/2) == k) {
					System.out.println(al);
				}
				count++;
				al.add(arr[j]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array aize: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter kth element");
		int k=sc.nextInt();
		print(arr, k);
		sc.close();
	}
}
