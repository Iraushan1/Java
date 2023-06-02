package Array;



public class UnionOfTwoArray {
	public static void meargeArray(int arr1[], int arr2[]) {
		int arr3[]=new int[arr1.length+arr2.length];
		int i;
		for(i=0; i<arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		for(int j=0; j<arr2.length; j++) {
			arr3[i++]=arr2[j];			
		}
		//System.out.println(Arrays.toString(arr3));
		removeDuplicate(arr3);
	}
	
	public static void removeDuplicate(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
			}
		}
		printArray(arr);
	}
	public static void printArray(int arr[]) {
		for(int a:arr)
			if(a!=-1)
				System.out.print(a+" ");
	}
}
