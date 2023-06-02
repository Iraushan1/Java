package Array;


//WAP to find merge to array.

import java.util.Scanner;
public class MergTwoArray 
{
	public static void mergTwoArray(int arr1[], int arr2[])
	{
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++)
		{
			arr3[i]=arr1[i];
		}
		
/*		int n=0;
		for(int i=arr1.length; i<(arr1.length+arr2.length); i++)
		{
			arr3[i]=arr2[n];
			n++;
		}
*/		
		
	
		int n=arr2.length;
		for(int i=0; i<arr2.length; i++)
		{
			arr3[n]=arr2[i];
			n++;
		}
	
		
		for(int a : arr3)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter 1st array size: ");
			int n1=sc.nextInt(); 
			System.out.println("Enter "+n1+" integer element: ");
			int a1[]=new int[n1];
			for(int i=0; i<a1.length; i++)
			{
				a1[i]=sc.nextInt();
			}
			System.out.println("Enter 2nd array size: ");
			int n2=sc.nextInt();
			System.out.println("Enter "+n2+" integer element: ");
			int a2[]=new int[n2];
			for(int i=0; i<a2.length; i++)
			{
				a2[i]=sc.nextInt();
			}
			mergTwoArray(a1,a2);
		}
		
	}

}
