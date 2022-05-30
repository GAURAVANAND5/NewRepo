package simplepgm;
//WAP to display the missing elements in a given sorted array.
public class MissingElement {

	public static void main(String[] args) {
		
		int []a= {1,4,7,9};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(j);
			}	
			
		}

	}

}
