package day8;

public class Employee {
		
	 int empid;
	 String name;
	 String job;
	 int esal;
	 
	 void display()
	 {
	 System.out.println(empid);
	 System.out.println(name);
	 System.out.println(job);
	 System.out.println(esal);
	 }
	 
	 public static void main(String[] args)
	 {
		 Employee emp=new Employee();
		 emp.empid=100;
		 emp.name="rahul";
		 emp.job="software Engineer";
		 emp.esal=50000;
		 
		 
		 emp.display();
		 
		 Employee emp2=new Employee();
		
		emp2.empid=200;
		 emp2.name="RAM";
		 emp2.job="software";
		 emp2.esal=80000;
		 
		 emp2.display();
		 
		 
		 
		 
	 }

	}

