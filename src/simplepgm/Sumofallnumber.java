package simplepgm;

import java.util.Scanner;

//wap to display sum of all the digit in the given no .
public class Sumofallnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int ld=0;
		int sum=0;
		while(num>0)
		{ 
			ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println("Sum of all the digits in the :"+num1+" is: "  +sum);

	}

}
