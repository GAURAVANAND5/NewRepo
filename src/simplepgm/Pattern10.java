package simplepgm;
//1
//A*B
//1*2*3
//A*B*C*D

public class Pattern10 {

	public static void main(String[] args) {
		int n=4;
		int c=7;
		int sp=c-1;
		
		for(int i=0;i<n;i++)
		{
			int k=1;
			char ch='A';
			for(int j=0;j<sp;j++)
			{
			System.out.print(" ");
			}
			for(int j=0;j<(i*2)+1;j++)
			{
				
				if(i%2==0 && j%2==0)
				{
					System.out.print(k++);
				}
				else if(i%2!=0 && j%2==0)
				{
					System.out.print(ch++);
				}
				else
				{
				System.out.print("*");
				}	
			}
			sp=sp-2;
		System.out.println();

	}
	}

}
