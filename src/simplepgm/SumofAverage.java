package simplepgm;

import java.util.Scanner;

// WAP to calculate the sum and average of n elements in the given int array
public class SumofAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		 System.out.println("enter the array emelment");
		 for(int i=0;i<s;i++)
		 {
	        a[i]=sc.nextInt();
		 }
		 System.out.println("Entert the n elemnets");
		 int n=sc.nextInt();
		 int sum=0;
		 int count=0;
		 int avg=0;
		 for(int i=0;i<s;i++)
		 {
			 sum=sum+a[i];
				count++;
			 if(n==a[i])
			 {
				break; 
			 }
	
	
		 }
		 avg=sum/count;
		System.out.println("averrage of given n elemnts in given array is:"+avg);

	}

}
