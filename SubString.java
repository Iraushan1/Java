package String;

import java.util.*;

public class SubString {
	public static void print(String s) {
		ArrayList<String> al=new ArrayList<>();
		String smallest="";
		String largest="";
		for(int i=0; i<3; i++) {			//k=3
			for(int j=i; j<s.length(); j+=3) {
				if((s.length()-j)>=3) {			//k=3
					String localStr = s.substring(j, 3+j);
					System.out.println(localStr);		//k+j
					al.add(localStr);
				}
			}
		}
		
		Collections.sort(al);
		System.out.println(al);
		smallest=al.get(0);
		largest=al.get(al.size()-1);
		System.out.println(smallest+"\n"+largest);
	}
	
	public static void subString(String s) {
		ArrayList<String> al=new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			String temp="";
			temp+=s.substring(i);			
			temp+=s.substring(0, i);
			al.add(temp);
		}
		Collections.sort(al);
		System.out.println(al);
	}
	public static void main(String[] args) {
		String s="ani";
		subString(s);
		//print(s);
	}
	
	
	public static void print1(String s) {
		String smallest="";
		String largest="";
		int min1=78;
		int max1=0;		
		for(int i=0; i<3; i++) {			//k=3
			for(int j=i; j<s.length(); j+=3) {
				if((s.length()-j)>=3) {			//k=3
					String localStr = s.substring(j, 3+j);
					System.out.println(localStr);		//k+j
					int min2=0;
					int max2=0;
					for(int k=0; k<localStr.length(); k++) {
						min2+=localStr.charAt(k);
						max2+=localStr.charAt(k);
					}
					if(min1>min2) {
						min1=min2;	
						smallest=localStr;
						System.out.println(smallest+"     hii");
					}
					if(max1<max2) {
						max1=max2;
						largest=localStr;
						System.out.println(largest+"      hello");
					}
				}
			}
		}
		System.out.println();
		System.out.println(smallest+"\n"+largest);
	}
	
	 public static String getSmallestAndLargest(String s, int k) {
		    String smallest = "";
		    String largest = "";
		    smallest = largest = s.substring(0, k);

		    for (int i=1; i<s.length()-k+1; i++) {
		        String substr = s.substring(i, i+k);
		        if (smallest.compareTo(substr) > 0)
		            smallest = substr;
		        if (largest.compareTo(substr) < 0)
		            largest = substr;
		    }

		    return smallest + "\n" + largest;
		}
}
