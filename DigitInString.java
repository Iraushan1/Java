package String;

public class DigitInString {
	public static void NoOfDigitInString(String s) {
		int count=0,sum=0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			{
				if(ch>=48 && ch<=57) {
					count++;
					switch(ch)
					{
					case '0': sum+=0;break;
					case '1': sum+=1;break;
					case '2': sum+=2;break;
					case '3': sum+=3;break;
					case '4': sum+=4;break;
					case '5': sum+=5;break;
					case '6': sum+=6;break;
					case '7': sum+=7;break;
					case '8': sum+=8;break;
					case '9': sum+=9;break;
					}	
				}
			}
		}
		System.out.println("No of digits= "+count);
		System.out.println("Sum of number= "+sum);
	}
}
