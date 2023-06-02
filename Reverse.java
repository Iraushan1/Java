package Array;

public class Reverse 
{
	public static void reverseArray(int arr[])
	{
		int i,temp,n=arr.length-1;
		for(i=0; i<arr.length/2; i++)
		{
			temp=arr[i];
			arr[i]=arr[n-i];
			arr[n-i]=temp;
		}
		for(int b:arr)
			System.out.print(arr[i]+" ");
	}
}
