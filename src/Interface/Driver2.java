package Interface;

public class Driver2 {

	public static void main(String[] args) {
		B obj1= new B();
		obj1.a1();
		obj1.a2();
		
		I5 obj2=obj1;
		obj2.a1();
		//obj2.a2();//CTE
		 
		I6 obj3=obj1;
		obj3.a2();
		//obj3.a1();//CTE
		

	}

}
