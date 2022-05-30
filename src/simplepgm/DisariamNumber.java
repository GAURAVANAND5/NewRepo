package simplepgm;
//WAP to check the number is disariam number
//89->8^1+9^2=8+81=89
import java.util.Scanner;

public class DisariamNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num=sc.nextInt();
		int num1=num;
		int num2=num;
		int count=0;
		int ld=0;
		int sum=0;
		while(num>0)
		{
			
        	num=num/10;
        	count++;
		}
		while(num1>0)
		{
			int p=1;
			ld=num1%10;
        	
		for(int i=1;i<=count;i++)
		{
			p=p*ld;
			
		}
		sum=sum+p;
	    num1=num1/10;
	    count--;
       }
		System.out.println(sum);
		if(sum==num2)
		{
			System.out.println("number is disariam");
		}
		else
		{
			System.out.println("number is not disariam");	
		}

	}

	}

