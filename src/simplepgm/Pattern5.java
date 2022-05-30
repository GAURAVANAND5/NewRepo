package simplepgm;
//1
//2*1
//3*2*1
//4*3*2*1
//5*4*3*2*1

public class Pattern5 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			int k=i+1;
			for(int j=0;j<(i*2)+1;j++)
			{
				if(j%2==0)
				{
					System.out.print(k);
					k--;
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
