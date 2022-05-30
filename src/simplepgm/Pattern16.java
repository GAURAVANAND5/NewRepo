package simplepgm;
//  *
// ***
//*****
// ***
//  *
public class Pattern16 {

	public static void main(String[] args) {
		
		int n=5;
		int sp=n-3;
		int c=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
			   System.out.print(" ");
			}
			for(int j=0;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			sp--;
			c=c+2;
			if(i>=2&&i<=5)
			{
				sp=1;
				c=n-2;
				for(int j=0;j<sp;j++)
				{
				   System.out.print(" ");
				}
				for(int j=0;j<c;j++)
				{
					System.out.print("*");
				}
				System.out.println();
				sp++;
				c=c-2;
			}
			
			}
	}

}
