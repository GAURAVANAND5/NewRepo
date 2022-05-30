package simplepgm;

public class Pattern17 {

	public static void main(String[] args) {
		
		char[] a= {'g','s','a','v','f'};
		char ch='a';
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(ch==a[i])
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.println(ch+"is present int arrray");
		}
		else
		{
			System.out.println(ch+"is  not present int arrray");
		}
		}

	}


