package simplepgm;
//*****
//  ***
//    *
public class Pattern12 {

	public static void main(String[] args) {
		
		int n=3;
		int c=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2);j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<c;j++)
			{
			System.out.print("*");
			}
			c=c-2;
		System.out.println();
		}
		

	}

}
