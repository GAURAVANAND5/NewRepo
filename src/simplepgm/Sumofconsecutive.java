package simplepgm;
//find sum of numbers formed by exchanging consecutive digits
//input 2415,output is 42+14+51=107
import java.util.Scanner;

public class Sumofconsecutive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int ld;
		int ld1;
		int sum=0;
		while(num>9)
		{
			ld=num%10;
			num=num/10;
			ld1=num%10;
			sum=sum+(ld*10+ld1);
			
		}
		System.out.println("sum of number exchaning consecutive digits is: "+sum);

	}

}
