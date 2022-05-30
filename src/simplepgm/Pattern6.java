package simplepgm;
//A
//B*C
//D*E*F
//G*H*I*J
//K*L*M*N*O


public class Pattern6 {
	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<(i*2)+1;j++)
			{
				if(j%2==0)
				{
					System.out.print(ch);
					ch++;
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
