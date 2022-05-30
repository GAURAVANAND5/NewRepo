package simplepgm;

import java.util.Scanner;

public class Printpositional {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int ld;
		int count=0;
		 int mul=1;
		while(num>0)
		{
			ld=num%10;
			System.out.println(ld*mul+",");
			num=num/10;
			mul=mul*10;
		}
	}
}