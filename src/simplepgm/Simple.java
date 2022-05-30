package simplepgm;

public class Simple {

	public static void main(String[] args) {
		
		int n=6;
		char m=1;
		for(int i=0;i<n;i++)
		{ 
			
			for(int j=0;j<n;j++)
			{ 
				if(i>=j)
				{

		           System.out.print(m);
				   m++;
				 
				} 
				else 
				{
					System.out.print(" ");
				   
				}
			}
	
			System.out.println();
		}

	}

}
