package simplepgm;
//wap 
import java.util.Scanner;

public class Seconddigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int ld=0;
		while(num>9)
		{ 
			ld=num%10;
			num=num/10;
		
		}
		System.out.println("first digit of the number is:"+ld);

	}

}
