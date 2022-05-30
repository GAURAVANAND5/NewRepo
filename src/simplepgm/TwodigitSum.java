package simplepgm;

import java.util.Scanner;
//Write program which reads two number(Assume that both have same number of digits)
//the program outputs the sum of product of corresponding digits;
//input 327 and 539 output 3*5+2*3+7*9=84;
public class TwodigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();

		int ld=0;
		int ld1=0;
		int sum=0;
		while(num1>0)
		{
			ld=num1%10;
			ld1=num2%10;
			sum=sum+ld*ld1;
			num1=num1/10;
			num2=num2/10;
			
		}
		System.out.println("output of the sum of product of corresponding digit is:"+sum);

	}

}
