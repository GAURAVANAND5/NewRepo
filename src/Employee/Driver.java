package Employee;

public class Driver {

	public static void main(String[] args) 
	{

	 Developer e1=new Developer("Gaurav",1,100000.0,"Developerengineers");
	 TestEngineer e2=new TestEngineer("Anand",2,100000.0,"testeng");
	 Hr e3=new Hr("saurav",3,100000.0,"hr");
	 
     displayDetails(e1);
     displayDetails(e2);
     displayDetails(e3);
	}
	public static void displayDetails(Emp e)
	{
		System.out.println("Name:"+e.getName());
		System.out.println("Eid:"+e.getEid());
		System.out.println("Salary:"+e.getSalary());
		System.out.println("Designation:"+e.getDesignation());
		e.work();
		if(e instanceof Developer)
		{
			((Developer)e).code();
		}
		else if(e instanceof TestEngineer)
		{
		((TestEngineer)e).writeTestCase();	
		}
		else if(e instanceof Hr)
		{
			((Hr)e).recruit();
		}
	
	}

}
