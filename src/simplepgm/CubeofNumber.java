package simplepgm;
//DAM which returned cube of a given number
public class CubeofNumber {
	
	public static int cube(int num)
	{
	
		
		int pro=num*num*num;
		return pro;
			
	}

	public static void main(String[] args) {
		
		int num=2;
		int n=cube(num);
		System.out.println("cube of "+num+" is:"+n);
		

	}

}
