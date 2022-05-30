package Abstraction;

public class Driver2 {

	public static void main(String[] args) {
		
		H5 obj1=new H5();
		obj1.a1();
		obj1.a2();
		H6 obj2=new H6();
		obj2.a1();
		obj2.a2();
		obj2.a3();
		
		H3 obj3=obj2;
		obj3.a1();
		obj3.a2();
		obj3.a3();

		H2 obj4=obj2;
		obj4.a1();
		obj4.a2();
		//obj4.a3();// CTE
	}

}
