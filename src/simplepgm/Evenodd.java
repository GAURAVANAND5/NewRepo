package simplepgm;
//wap to number is even or odd using method

public class Evenodd {
	public static void evenodd(int a,int b)
	{
		int i=a;
		while(i<b)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even number");
			}
			else
			{
				System.out.println(i+" is odd number");	
			}
			i++;
		}
	}

	public static void main(String[] args) {
		
		evenodd(10,20);
	}

}
