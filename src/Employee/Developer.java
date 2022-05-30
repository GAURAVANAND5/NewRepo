package Employee;

public class Developer extends Emp
{
	Developer()
	{
		
	}
	Developer(String name,int eid,double salary ,String designation)
	{
		super(name,eid,salary,designation);
	}
	public void code()
	{
		System.out.println("coding!!!");
	}
	
	

}
