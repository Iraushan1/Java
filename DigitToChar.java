package String;

public class DigitToChar {
	public static void convertDigitToCharacter(int n) {
		int r,rev=0;
		int m=n;
		while(m!=0) {
			r=m%10;
			rev=rev*10+r;
			m/=10;
		}
		while(rev!=0) {
			r=rev%10;
			switch(r)
			{
			case 0: System.out.print("Zero ");break;
			case 1: System.out.print("One ");break;
			case 2: System.out.print("Two ");break;
			case 3: System.out.print("Three ");break;
			case 4: System.out.print("Four ");break;
			case 5: System.out.print("Five ");break;
			case 6: System.out.print("Six ");break;
			case 7: System.out.print("Seven ");break;
			case 8: System.out.print("Eight ");break;
			case 9: System.out.print("Nine ");			
			}
			rev/=10;
		}
	}
	public static void main(String[] args) {
		int n=12345;
		convertDigitToCharacter(n);
	}
}
