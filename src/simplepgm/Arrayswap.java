package simplepgm;
//Wap to swap the value of array in the given index.
import java.util.Scanner;

public class Arrayswap {

	public static void main(String[] args) {
		
		int []a= {4,6,3,9,2,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Before swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter the inder value of array");
		int i1=sc.nextInt();
		int i2=sc.nextInt();
	     
		a[i1]=a[i1]+a[i2];
		a[i2]=a[i1]-a[i2];
		a[i1]=a[i1]-a[i2];
		

		System.out.println("After swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
