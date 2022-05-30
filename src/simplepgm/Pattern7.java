package simplepgm;
//1
//0*1
//0*1*0
//1*0*1*0
//1*0*1*0*1
//0*1

public class Pattern7 {

	public static void main(String[] args) {
		int n=6;
		int k=1;
		int c=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<(i*2)+1;j++)
			{
				if(j%2==0)
				{
					if(k==1)
					{
					System.out.print(k);
					k++;
					c++;
					if(c>9)
					{
						break;
					}
					}
					else
					{
						k=0;
						System.out.print(k);
						k++;
						
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
