package day12;

final class Test1
{
	final void m()
	{
		System.out.println("m is Test class");
	}
}

class Result extends Test1   //because Test1 is final class
{
	void m()    // incorrect-because m is final method.
	{
		System.out.println("m is result class");
	}
}



public class FinalKeyword1 {

	public static void main(String[] args) {
		Result r=new Result();
		r.m();

	}

}


//final method- we can't override method in child class.
//final class- we can't extend class in to another class.
