package simplepgm;

import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student number of Students");
		int n=sc.nextInt();
		 Student []st=new Student[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter student"+(i+1)+"details");
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter rollno");
			int rollNo=sc.nextInt();
			System.out.println("Enter age");
			int age=sc.nextInt();
			
			st[i]= new Student(name,rollNo,age);
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println("student"+(i+1)+"details");
			System.out.println("Name:"+st[i].name);
			System.out.println("Rollno:"+st[i].rollNo);
			System.out.println("Age"+st[i].age);
			System.out.println("..........................");
		}

	}

}
