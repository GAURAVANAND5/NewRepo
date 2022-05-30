package simplepgm;

public class OputputString {

	public static void main(String[] args) {
		String s="HAD5T23C";
		char []s1=s.toCharArray();
		int sum=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]>='0' && s1[i]<= '9' )	
			{
//				int a=Integer.parseInt(String.valueOf(s1[i]));
//			  sum =sum+a;
				sum=sum+(s1[i]-48);
			}
		}
		System.out.println("sum of number is:"+sum);

	}

}
