package LogicPgm;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=1634;
		int num1=num;
		int num2=num;
		int ld=0;
		int count=0;
		int sum=0;
		while(num>0)
		{   
			num=num/10;
			count++;
		}
		while(num1>0)
		{
			int n=1;
		 ld=num1%10;
		for(int j=count;j>0;j--)
		{   
			n=n*ld;	
		}
		sum=sum+n;
		num1=num1/10;
		}
		if(sum==num2)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}
}

