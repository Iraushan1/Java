package Array;

/*Que-1)
_____________________
Define a method which accepts an array of numbers and return the sum of unique numbers from the array.

Write the method with the following specifications: 

Name of method sumOfArray() 
Arguments: one argument of type integer array
Return Type: an integer value

Specifications: The value returned by the method sumOfArray() is determined by the following rules:

Array must not be null or length must not be 0. If yes, then return -1                                                               
Array must not contain negative values. If yes, then return -2

Input: {1, 2, 3, 2, 4, 1}
Output: 7
*/

import java.util.Scanner;
public class SumUnike 
{
	public static int sumOfArray(int arr[])
	{
		int flag=0;
		int sum=0;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]!=arr[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				sum+=arr[i];
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter integer array size: ");
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0; i<n; i++)
			{
				a[i]=sc.nextInt();
			}
			sumOfArray(a);
		}
	}
}
