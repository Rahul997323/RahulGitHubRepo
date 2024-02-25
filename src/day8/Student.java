package day8;

public class Student {

		
		int sid;
		String sname;
		char sgrade;
		
		
		void display()
		{
		System.out.println(sid+"  "+sname+"   "+sgrade);
	    }
		
		void setData(int id, String name, char g)
		{
			sid=id;
			sname=name;
			sgrade=g;
		}

}
