package simplepgm;
//wap to find sum of product of consecutive digit of a given number
import java.util.Scanner;

public class Prdouctofsum {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int ld=0;
		int product=1;
		int sum=0;
		int ld1=0;
		while(num>0)
		{
			ld=num%10;
			num=num/10;
			ld1=num%10;
			product=(ld*ld1);
			sum=sum+product;
		}
		System.out.println("sum ofproduct of consecutive digit of agiven number is: "+sum);

	}

}
