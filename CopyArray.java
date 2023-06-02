package Array;

import java.util.Scanner;
public class CopyArray 
{
	public static void copyArrayElements(int arr[])
	{
		int x[]=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			x[i]=arr[i];
		}
		for(int  y : x)
		{
			System.out.print(y+" ");
		}
	}
	public static void main(String[] args) 
	{
		
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter integer array size: ");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter "+n+" integer element: ");
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			copyArrayElements(a);
		}
	}
}
