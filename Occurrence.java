package String;

public class Occurrence {
	public static void findMaxCharElement(String s) {
		int count=0,i,j,max=0;
		char ch = 0;
		System.out.print("Maximum occurrence of words: ");
		for(i=0; i<s.length(); i++) {
			count=0;
			char ch1=s.charAt(i);
			for(j=0; j<s.length(); j++) {
				char ch2=s.charAt(j);
				if(ch1==ch2)
					count++;
			}
			if(max<count) {
				max=count;
				ch=ch1;
			}
		}
		System.out.println(ch+" "+count);
	}
}
