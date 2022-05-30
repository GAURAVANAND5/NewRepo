package inheritance;
class E
{
	static int a=1;
	int i=10;
}
class F extends E
{
	static int b=2;
	int j=20;
}
public class Driver2 {

	public static void main(String[] args) 
	{
	    E obj1=new E();
	    System.out.println(obj1.a);
	    System.out.println(obj1.i);
	   // System.out.println(obj1.b);
	   // System.out.println(obj1.j);
	    F obj2=new F();
	    System.out.println(obj2.b);
	    System.out.println(obj2.j);
	    System.out.println(obj2.a);
	    System.out.println(obj2.i);

	}

}
