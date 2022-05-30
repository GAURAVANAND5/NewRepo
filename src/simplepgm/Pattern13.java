package simplepgm;
//1
//3*2
//4*5*6
//10*9*8*7
//11*12*13*14*15

public class Pattern13 {

	public static void main(String[] args) {
		
		int n=5;
		int k=1;
		int l=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{
				if(i%2==0&&j%2==0)
				{
					
					System.out.print(k++);
					l=l+3;
							
				}
				else if(i%2!=0&&j%2==0)
				{
					
					System.out.print(l);
					l--;
					k++;
					
				}
				else
				{
					
					System.out.print("*");
				}
			}
		
		System.out.println();
		}

	}

}

