package simplepgm;

public class Panagram {

	public static void main(String[] args) {
		String s="zyBCDEFGHIJKLMNOPQRSTWXsd";
		String s1=s.toLowerCase();
		char []ch=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>='a'&&ch[i]<='z')
		{
			count++;
		}
		}
		System.out.println(count);
		if(count>=26)
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not panagram");
		}
		
		

	}

}
