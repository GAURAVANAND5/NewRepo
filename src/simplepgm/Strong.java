package simplepgm;
//DAM to find the number is strong or not
import java.util.Scanner;

public class Strong {
	public static int fact(int f)
	{
		int factorial=1;
		while(f>0)
		{
		factorial=factorial*f;
		f--;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int ld=0;
		int fact1=0;
		int sum=0;
		while(num>0)
		{
			ld=num%10;
			fact1=fact(ld);
			sum=sum+fact1;
			num=num/10;
			
		}
		 if(sum==num1)
		   {
			   System.out.println("number is strong");
		   }
		   else
		   {
			   System.out.println("number is not strong");
			   
		   }
		}
		
		
	}

