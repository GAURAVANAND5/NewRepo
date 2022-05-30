package Abstraction;

public class Driver {

	public static void main(String[] args) {
		
		C obj1=new C();
		obj1.m1();
		obj1.m2();
		
		B obj2=obj1;
		obj2.m1();
		obj2.m2();
		
		A obj3=obj1;
		obj3.m1();
		//obj3.m2();//CTE

	}

}
