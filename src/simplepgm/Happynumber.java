package simplepgm;
//wap to check number is happy number or not?
//
public class Happynumber {

	public static void main(String[] args) {
	
		int num=19;
		int num1=num;
		
		while(num1!=1 && num1!=4)
		{
			num1=happy(num1);
		}
		if(num1==1 || num1==4)
		{
			System.out.println("number is happy number");
		}
		else
		{
			System.out.println("number is not happy number");
		}

	}

	public static int happy(int num1) {
		int sum=0;
		int ld;
		while(num1>0)
		{
			ld=num1%10;
			sum=sum+(ld*ld);
			num1=num1/10;
		}
		return sum;
	}

}
