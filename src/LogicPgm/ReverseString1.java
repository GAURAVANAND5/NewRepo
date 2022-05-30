package LogicPgm;
//Print the string in reverse order without using length().
public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="testing";
		char[] s=str.toCharArray();
		int count=0;
		for(char c: s) {
			count++;
			
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
		System.out.println(s[i]);
		}


	}

}
