package simplepgm;
//1
//2*3
//4*5*6
//7*8*9*1
//2*3*4*5*6
public class pattrrn3 {

	public static void main(String[] args) {
		int n=5;
		int m=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{
			
				if(j%2==0)
				{
					System.out.print(m);
					m++;
					if(m==10)
					{
						m=1;
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
