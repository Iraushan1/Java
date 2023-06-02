package Array;

import java.util.Scanner;
public class EvenOddArray 
{
	public static void findOddEvenElement(int arr[])
	{
		int oArray[]=new int[arr.length];
		int eArray[]=new int[arr.length];
		int x=0,y=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				eArray[x]=arr[i];
				x++;
			}
			else
			{
				oArray[y]=arr[i];
				y++;
			}
		}
		System.out.print("Even array: ");
		for(int a : eArray)
		{
			System.out.print(" "+a);
		}
		System.out.println();
		System.out.print("Odd array: ");
		for(int a : oArray)
		{
			System.out.print(" "+a);
		}
	}
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter integer array size:");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter "+n+" integer element: ");
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			findOddEvenElement(a);
		}
	}
}
