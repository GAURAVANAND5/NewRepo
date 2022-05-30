package simplepgm;
//1,4,7,10,13
public class Series2 {

	public static void main(String[] args) {
		
		int sum=0;
		int k=1;
		for(int i=1;i<=10;i++)
		{
			
			System.out.print(k+",");
			sum=sum+k;
			k=k+3;
		}
		System.out.println("sum of first 10 term is:"+ sum);

	}

}
