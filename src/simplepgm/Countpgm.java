package simplepgm;
//wap to print total number of digit in a number.
public class Countpgm {

	public static void main(String[] args) {
		
		int num=238;
		int num1=num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count of digits in"+num1+"is"+count);

	}

}
