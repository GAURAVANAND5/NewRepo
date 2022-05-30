package inheritance;

class Ee1 
{
	{
		System.out.println("From IIB-1");
	}
	Ee1()
	{
		System.out.println("From E()");	
	}
	Ee1(int a)
	{
		this();
		System.out.println("From E(int)");
	}

	public static void main(String[] args)
	{
		Ee1 obj1=new Ee1();
		Ee1 obj2=new Ee1(10);

	}

}