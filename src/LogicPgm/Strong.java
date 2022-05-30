package LogicPgm;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num=sc.nextInt();
		 int num1=num;
		 int ld=0;
		 int sum=0;
		 
		 while(num>0)
		 {
			 int mul=1;
			 ld=num%10;
			 while(ld>0)
			 {
				 mul=mul*ld;
				 ld--;
			 }
			 sum=sum+mul;
			 num=num/10;
		 }
		 if(num1==sum)
		 {
			 System.out.println("number enterd is strong");
		 }
		 else
		 {
			 System.out.println("number enterd is  not strong");
		 }

	}

}
