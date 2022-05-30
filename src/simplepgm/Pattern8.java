package simplepgm;
//1
//2*3
//4*5*6
//7*8*9*10
//11*12*13*14*15
//16*17

public class Pattern8 {
	public static void main(String[] args) {
		int n=6;
		int k=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<(i*2)+1;j++)
			{
				if(j%2==0)
				{	
					System.out.print(k);
					k++;
					
					if(k>17)
					{
						break;
					}
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
