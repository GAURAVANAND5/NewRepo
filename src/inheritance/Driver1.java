package inheritance;
class C
{
	int i=10;
	public void test1()
	{
		System.out.println("From test1() of C");
		
	}
}
class D extends C
{
	int j=20;
	public void test2()
	{
		System.out.println("From test2() of D");
		
	}
}
public class Driver1 {

	public static void main(String[] args)
	{
		C obj1=new C();
		System.out.println(obj1.i);
		obj1.test1();
		//System.out.println(obj1.j);
		//obj1.test2();
		D obj3=new D();
		System.out.println(obj3.j);
		obj3.test2();
		System.out.println(obj3.i);
		obj3.test1();
	

	}

}
