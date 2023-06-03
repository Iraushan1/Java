package String;

public class Palind {
	public static void maIN(String s)
	{
		String s1[]=s.split(" ");
		
		for(String c:s1 )
		{
			String temp="";
			for(int i=c.length()-1;i>=0;i--)
			{
				temp+=c.charAt(i);
			}
		
		if(c.equals(temp))
		System.out.println(c+" , ");
		}
	}
	public static void main(String[] args) {
		String s="anish kumar liril anina";
		maIN(s);
	}
}
