package simplepgm;
//wap to find second largest in the given array.
public class SecondLargest {

	public static void main(String[] args) {
		
          int []a= {7,5,3,12,9,2};
          int largest=a[0];
          int secondl=0;
          for(int i=0;i<a.length;i++)
          {
        	  if(largest<a[i])
        	  {
        		  largest=a[i];
        	  }
        	   else if(secondl<a[i])
        	  {
        		secondl=a[i];  
        	  }
          }
          
          
          System.out.println(largest);
          System.out.println(secondl);
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
//          System.out.println("largest is:"+largest);
//          for(int i=0;i<a.length;i++)
//          {
//        	  if(largest==a[i])
//        	  {
//        		  continue;
//        	  }
//        	  else if(secondl<a[i])
//        	  {
//        		  secondl=a[i];
//        	  }
//        	  
//          }
//          System.out.println("slargest is:"+secondl);
	}

}
