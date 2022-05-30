package Employee;

public class TestEngineer extends Emp
{
    TestEngineer()
    {
		
	}
   TestEngineer(String name,int eid,double salary ,String designation)
	{
		super(name,eid,salary,designation);
	}
	public void writeTestCase()
	{
		System.out.println("Writing testcases");
	}
	

}
