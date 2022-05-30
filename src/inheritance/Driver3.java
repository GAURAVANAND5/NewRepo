package inheritance;

class A1
{
	static int a=10;
	int b=20;
	A1()
	{
		System.out.println("From A()");
	}
}
class B1 extends A1
{
	static int c=30;
	int d=40;
	B1()
	{
		System.out.println("From B()");
	}
}
class C1 extends B1
{
	static int e=50;
	int f=60;
	C1()
	{
		System.out.println("From C()");
	}
}
public class Driver3 {

	public static void main(String[] args) 
	{
		C1 obj1=new C1();

	}

}
