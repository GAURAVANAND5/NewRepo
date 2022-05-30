package simplepgm;

public class SpecialGmail {

	public static void main(String[] args) {
		
		String s="abcd@gmail.com";
		System.out.println(s.substring(0,s.indexOf('@')));
		char []s1=s.toCharArray();
		String s2=" ";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!='@')
			{
				s2=s2+s1[i];
			}
			else
			{
				break;
			}
		}
		System.out.println(s2);

	}

}
