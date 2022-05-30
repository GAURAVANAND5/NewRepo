package Array2d;

import java.util.Scanner;

public class Print2DMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of row");
	    int row = sc.nextInt();
	    System.out.println("Enter number of columns");
	    int col = sc.nextInt();
	   
	    int [][]a=new int[row][col];
	    System.out.println("enter values of the matrix");
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		System.out.println("enter row"+i+"column"+j+"value");
	    		a[i][j]=sc.nextInt();
	    	}
	    	
	    }
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		System.out.print(a[i][j]+" ");
	    	}
	    	
	    	System.out.println();
	    }
	    for(int i=0;i<row;i++)
	    {int sum=0;
	    	for(int j=0;j<col;j++)
	    	{
	    		sum=sum+a[i][j];
	    	}
	    	System.out.println("sum of "+i+"row is:"+sum);
	    	
	    }
	    
		

	}

}
