package simplepgm;

import java.util.Scanner;

//wap to display nth digit of a number from the last.
public class Nthdigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("nth number");
		int n=sc.nextInt();
		int ld=0;
		int count=0;
		while(num>0)
		{
			ld=num%10;
			count++;
			num=num/10;
			if(count==n)
			{
				break;
			}
			
		}
		System.out.println("nth digit of the number is:"+ld);
		

	}

}
