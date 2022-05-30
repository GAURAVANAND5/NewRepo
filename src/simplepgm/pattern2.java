package simplepgm;
//1
//234
//56789
//1234567
public class pattern2 {

	public static void main(String[] args) {
		
		int n=4;
		int m=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{
				if(m<10)
				{
				System.out.print(m);
				m++;
				}
				else
				{
					m=1;
					System.out.print(m);
					m++;
				}
			}
			System.out.println();
		}

	}

}
