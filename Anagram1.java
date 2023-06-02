package String;

public class Anagram1 {
	public static boolean sameCharacter(String s1, String s2)
	{
		boolean b=true;
		int sum1=0,sum2=0;
		if(s1.length()==s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				sum1+=s1.charAt(i);
				sum2+=s2.charAt(i);
			}
			if(sum1!=sum2)
				b=false;
		}
		else
			b=false;
		return b;
	}
}
