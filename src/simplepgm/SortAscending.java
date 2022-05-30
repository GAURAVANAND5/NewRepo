package simplepgm;

public class SortAscending {

	public static void main(String[] args) {
		
		int []a= {13,9,6,35,4};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
