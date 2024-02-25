package day8;

public class Students {

	public static void main(String[] args) {
		
		Student su=new Student();
		//Approach 1
		/*su.sid=100;
		su.sname="Rahul";
		su.sgrade='A';
		
		su.display();*/
		
		//Approach--2
		
		su.setData(100, "rahul", 'A');
		su.display();

	}

}
