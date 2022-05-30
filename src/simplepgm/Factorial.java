package simplepgm;

import java.util.Scanner;

//DAM factorial of a given number
public class Factorial {
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
		int result=fact(num);
		System.out.println("factorial of "+num+" is:"+result);

	}

}
