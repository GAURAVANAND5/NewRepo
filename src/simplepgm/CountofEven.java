package simplepgm;
//DAM which returns count of even numbers present in the array.
public class CountofEven {
	public static int even(int []a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int []a= {12,45,3,6,9,8};
		int count=even(a);
		System.out.println("Coutn of even number is:"+count);
		
    
	}

}
