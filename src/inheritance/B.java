package inheritance;

class A
{
	static int a;
	public static void test() 
	{
	System.out.println("From test() of A");
		
	}
}

class B extends A
{

	public static void main(String[] args) 
	{
		System.out.println(a);
		test();
		System.out.println(B.a);
		B.test();
		B obj=new B();
		System.out.println(obj.a);
		obj.test();
		

	}

}