package LogicPgm;

import java.util.Scanner;

public class Perfact {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter perfact number");
		int num=sc.nextInt();
		int sum=0;
		int num1=num;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				
			}
		}
		if(sum==num1)
		{
			System.out.println("Number taken is perfact");
		}
		else
		{
			System.out.println("Number taken is not perfact");	
		}

	}

}
