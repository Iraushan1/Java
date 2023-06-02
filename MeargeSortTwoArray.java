package Array;

public class MeargeSortTwoArray 
{
	public static void meargeTwoArray(int a1[], int a2[])
	{
		int i,j;
		int arr[]=new int[a1.length+a2.length];
		for(i=0; i<a1.length; i++)
			arr[i]=a1[i];
		for(j=0; j<a2.length; j++)
			arr[i++]=a2[j];
		
		for(int b:arr)
			System.out.print(b+" ");
	}
}
