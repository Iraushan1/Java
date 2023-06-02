package Array;


public class FrequencyOfElement {
	public static void printFrequencyOfElement(int arr[]) {
		int count=1;
		for(int i=0; i<arr.length-1; i++) {
			count=1;
			for(int j=i+1 ;j<arr.length; j++) {
				if(arr[i]==arr[j]) {
			  		count++;
					arr[j]=-1;
				} 
			}
			if(arr[i]!=-1)
			System.out.println(arr[i]+" Frequency "+count);
		}
	}
}
