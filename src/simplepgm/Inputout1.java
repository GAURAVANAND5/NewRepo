package simplepgm;

public class Inputout1 {

	public static void main(String[] args) {
		
		String s1="welcome to qspiders";
		String[] s2=s1.split(" ");
		String s3=" ";
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].charAt(0)>='a'&&s2[i].charAt(0)<='z')
			{
				s3=s3+(s2[i].charAt(0));
			}
			s3=s3+s2[i];
		}
		s3=s3.trim();
		System.out.println(s3);

	}

}
