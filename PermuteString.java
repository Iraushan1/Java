package String;

public class PermuteString {
	public static void generatePermutation(String str, int start, int end) {
		if(start==end-1)
			System.out.println(str);
		else {
			for(int i=start; i<end; i++) {
				str = swapString(str, start, i);
				
				generatePermutation(str, start+1, end);
				
				str = swapString(str, start, i);
			} 
		}			
	}  
	public static String swapString(String str, int i, int j) {
		char b[] = str.toCharArray();
		char ch;
		
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		System.out.println(ch+"====="+String.valueOf(b));
		return String.valueOf(b);		
	}
	public static void main(String[] args) {
		String str="ab";
		int len=str.length();
		generatePermutation(str, 0, len);
	}
}
