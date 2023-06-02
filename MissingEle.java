package Array;

/*Program: 27
Define a method to find the missing element in integer array of 1 to 7?
Method name: findElement
Argument:int[]
Return type:int 
Logic: To solve this problem are to calculate sum of all numbers in the 
array and compare with an expected sum, the difference would be the missing 
number.
For example, int ar [] = new int[]{1,2,3,5,6,7};
Sum of numbers from 1 to 7 is 28; sum of elements in the array is 24.
The difference (28-24) is 4 so the missing element in the array is 4
*/

public class MissingEle {
	public static void findElement(int arr[])
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		//System.out.println(max+" "+min);
		int flag=0;
		for(int i=min; i<=max; i++) {
			flag=0;
			for(int j=0; j<arr.length; j++) {
				if(i==arr[j])
					flag=1;
			}
			if(flag==0)
				System.out.print(i+" ");
		}
		
	}
}
