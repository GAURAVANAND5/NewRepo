package simplepgm;
//wap to find smallest number in the given array.
public class SmallestNumber {

	public static void main(String[] args) {
		
		int []a= {5,12,34,7,2,9};
	     int smallest=a[0];
	      for(int i=0;i<a.length;i++)
	      {
	    	  if(smallest>a[i])
	    	  {
	    		  smallest=a[i];
	    	  }
	      }
	    System.out.println("Smallest number is:"+smallest);

	}

}
