package day12;

interface Shape
{
	int length=10;
	int width=20;
	
	void circle();
	
	default void square()
	{
		System.out.println("This is square-default method");
	}
	
	 static void rectangle()
	 {
		 System.out.println("rectangle -static method");
	 }
	
}


public class InterfaceDemo implements Shape
{
	public void circle()
{
	System.out.println("This is circle");
}

	public static void main(String[] args)
	{
		
		InterfaceDemo id=new InterfaceDemo();
		id.circle();
		id.square();
		
		Shape s=new InterfaceDemo();
		s.circle();
		s.square();
		Shape.rectangle();
		
	}
	

}
