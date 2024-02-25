package day9;

public class ConstructorDemo {

	
	int x;
	int y;
	String s;
	
	ConstructorDemo()
	{
		
		 x=100;
		 y=200;
		 s="Rahul";
	}

	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		ConstructorDemo ct=new ConstructorDemo();
		ct.display();
		

	}

}
