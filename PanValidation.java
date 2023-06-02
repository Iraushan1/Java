package String;

public class PanValidation {
	public static void panNoValidation(String s) {
		boolean b=true;
		if(s.length()==10)
		{
			String x=s.substring(0, 5);
			String y=s.substring(5, 9);
			for(int i=0; i<x.length(); i++) {
				char c1=x.charAt(i);
				if(c1<65 || c1>90) {
					b=false;
					break;
				}
			}
			for(int i=0; i<y.length(); i++) {
				char c1=y.charAt(i);
				if(c1<48 || c1>57) {
					b=false;
					break;
				}
			}
			if(s.charAt(s.length()-1)<65 || s.charAt(s.length()-1)>90) {
				b=false;
			}
		}
		else {
			b=false;
		}
		System.out.println("Enter PAN No is: "+b);
	}
}
