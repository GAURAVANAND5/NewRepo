package simplepgm;

public class StringStartingEnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love my india";
		String str[]=s.split(" ");
		String str1=" ";
		for (int i = str.length-1;i>=0; i--) {
			str1=str1+" "+reverse(str[i]);
			
		}
		str1=str1.trim();
		System.out.println(str1);

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		String str1="";
		for (int i = str.length()-1; i>=0 ; i--) {
			
			str1=str1+str.charAt(i);
		}
		return str1;
	}

}
