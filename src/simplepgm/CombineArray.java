package simplepgm;
//WAP to combine two arrays.
public class CombineArray {

	public static void main(String[] args) {
		
		int []a= {3,5,8};
		int []b= {6,10,11};
		int s=a.length;
		int s1=b.length;
		int []c=new int[s+s1];
		
		for(int i=0;i<s;i++)
		{
			c[i]=a[i];
		}
		int k=s;
		for(int i=0;i<s1;i++)
		{
			c[s]=b[i];
			s++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+",");
		}

	}

}
