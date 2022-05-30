package simplepgm;

public class DisplayCountofString {

	public static void main(String[] args) {
		
		String s= "Ab2@4R vyn i";
		int uc=0;
		int lc=0;
		int lv=0;
		int c=0;
		int d=0;
		int se=0;
	    int sp=0;
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			uc++;
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				lv++;
			}
			else
			{
				c++;
			}
		
		}
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			lc++;
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				lv++;
			}
			else
			{
				c++;
			}
		}
		else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			d++;
		}
		else if(s.charAt(i)==' ')
		{
			se++;
		}
		else
		{
			sp++;
		}
		}
		
		 System.out.println("Count of uppercase latter: "+uc);
		 System.out.println("Count of lowercase latter: "+lc);
		 System.out.println("Count of vowel latter: "+lv);
		 System.out.println("Count of constants latter: "+c);
		 System.out.println("Count of digits: "+d);
		 System.out.println("Count of space :"+se);
		 System.out.println("count of special character: "+ sp);
		

	}
	}


