package simplepgm;
//Wap to create duplicate of the existing array.
public class Duplicate {

	public static void main(String[] args) {
		
		int []a= {5,8,1,2,6,7};
//		int s=a.length;
//		
//		int[]b=new int[s];
//		
//		for(int i=0;i<s;i++)
//		{
//			b[i]=a[i];
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
        for (int i = 0; i < a.length; i++) {
        	 for (int j = i+1;  j< a.length; j++) {
				if(a[i]!=a[j])
				{
					System.out.println(a[i]);
				}
			}			
		}
	}

}
