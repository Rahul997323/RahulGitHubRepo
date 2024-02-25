package day11;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	 
	}
}

class B extends A
{
	int b;
	void show() {
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}



public class SignleMultilevelInheritance {

	public static void main(String[] args) {
		
    /* B bobj=new B();
    bobj.a=100;
    bobj.b=200;
    bobj.display();
    bobj.show(); */
    
    C cocj=new C();
    cocj.a=500;
    cocj.b=600;
    cocj.c=700;
    
    cocj.display();
    cocj.show();
    cocj.print();
    
    
 
	}

}
