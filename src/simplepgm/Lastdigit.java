package simplepgm;
//wap to print all the digit of a number one by one starting from the last digit
public class Lastdigit {

	public static void main(String[] args) {
		
		int num=238;
		int ld=0;
		while(num>0)
		{ 
			ld=num%10;
			
			System.out.println("last digit is:"  +ld);
			num=num/10;
		}

	}

}
