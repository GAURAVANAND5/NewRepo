package LogicPgm;

import java.util.Iterator;

public class Secondmax {
	
	public static void main(String[] args) {
		int []a= {20,10,40,70,50};
		int b[]=new int[a.length];
		int max=a[0];
	    for (int i = 0; i < a.length; i++) {
	    	if(max<a[i])
	    	{
	    		max=a[i];
	    	}
	    	
	    }
	    System.out.println(max);
	    int smax=0;
	    for (int j = 0; j < a.length; j++) {
			
		if(smax<a[j] && max!=a[j])
		{
	      smax=a[j];
	    }
	    
	}
	    System.out.println("second"+smax);
	}

}
