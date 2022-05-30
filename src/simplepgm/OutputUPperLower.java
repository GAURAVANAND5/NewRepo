package simplepgm;

public class OutputUPperLower {

	public static void main(String[] args) {
		
		String s="AbCdEFg";
		 char []ch=s.toCharArray();
		 String s2=" ";
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]>='A'&& ch[i]<='Z')
			 {
				 s2=s2+((char)(ch[i]+32));
				 ch[i]=(char)(ch[i]+32);
			 }
			 else
			 {
				 s2=s2+((char)(ch[i]-32)); 
				 ch[i]=(char)(ch[i]-32);
			 }
		
		 }
		 s2=new String(ch);
		 System.out.println(s2);

	}

}
