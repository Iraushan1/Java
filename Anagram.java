package String;

public class Anagram 
{
	public static void checkStringAreAnagram1(String s1, String s2)
	{
     int sum1=0,sum2=0;
    
     for(int i=0; i<s1.length(); i++)
     {
         sum1+=s1.charAt(i);
     }
     for(int i=0; i<s2.length(); i++)
     {
         sum2+=s2.charAt(i);
     }
     if(sum1!=sum2)
    	System.out.print("Anagraham\n");
	 else
		System.out.print("Not a anagraham\n");
	}
	public static void checkStringAreAnagram(String s1, String s2)
	{
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		int i,j;
		char temp,flag=0;
		int n=a.length;
		int n1=b.length;
		if(n!=n1)
		{
			System.out.print("Not a anagraham\n");		
		}
		else
		{
			for(i=0; i<n; i++) 
			{
				for(j=i+1; j<n; j++) 
				{
					if(a[i]>a[j]) 
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					if(b[i]>b[j]) 
					{
						temp=b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
			for(i=0; i<n; i++)
			{
				if(a[i]!=b[i])
					flag=1;				
			}
			if(flag==0)
				System.out.print("Anagraham\n");
			else
				System.out.print("Not a anagraham\n");
		}
	}
}
