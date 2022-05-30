package simplepgm;
//wap to display first digit of a number.
import java.util.Scanner;

public class Firstdigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int ld=0;
		while(num>0)
		{
			//num=num/10;
			ld=num%10;
			num=num/10;
		}
		System.out.println("first digit of the number is:"+ld);
		

	}

}
