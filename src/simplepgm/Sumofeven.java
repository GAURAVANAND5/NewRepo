package simplepgm;

import java.util.Scanner;

public class Sumofeven {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int num1=num;
		int ld;
		int sum=0;
		while(num>0)
		{
			ld=num%10;
			if(ld%2==0)
			{
				sum=sum+ld;
			}
			num=num/10;
		}
		System.out.println("Sum of even digit of "+num1+" is: "+sum);
	}

}
