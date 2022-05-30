package Employee;

public class Hr extends Emp
{

	 Hr() 
	 {
		// TODO Auto-generated constructor stub
	}
	 Hr(String name,int eid,double salary ,String designation)
		{
			super(name,eid,salary,designation);
		}
		public void recruit()
		{
			System.out.println(" Hirring");
		}
		

}
