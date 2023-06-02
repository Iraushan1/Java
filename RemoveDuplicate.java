package array;

import java.util.Scanner;
public class RemoveDuplicate {
	public static void removeDuplicate(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
			}
		}
		
		for(int a:arr)
			if(a!=-1)
				System.out.print(a+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		removeDuplicate(arr);
		sc.close();
	}
}
