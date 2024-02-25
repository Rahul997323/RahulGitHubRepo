package day11;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}




public class HeirarchyInheritance1 {

	public static void main(String[] args)
	{
		Child1 ch=new Child1();
		ch.display(100);
		ch.show(200);
		
		Child2 ch2=new Child2();
		ch2.display(100);
		ch2.print(20);
		
		
	
	}
}
