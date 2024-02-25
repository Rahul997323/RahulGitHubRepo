package day3;

public class OpertatorDemo {

	public static void main(String[] args) {
		
		//1.)Arithmatic operator--->>   +,-,*,/,%
		
		int a=20, b=10;
		System.out.println("sum of the number is:"+a+b);
		System.out.println("sum of the number is:"+(a+b));
		System.out.println("Sub of the number is:"+(a-b));
		System.out.println("Multi of the number is:"+(a*b));
		System.out.println("Div of the number is:"+(a/b));
		System.out.println("Module of the number is:"+(a%b));
		
		//2.) Relational/comparison operator-->>    >, >=, <, <=, !=, ==
		//return true/false(boolean value)
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		//3.) Logical Operator--->>   &&, ||, !
		// works 2 or more boolean value
		//return boolean value true/false
		
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(y||x);
		System.out.println(!x);
		
		
		boolean b1=10>20;   //false
		boolean b2=10<20;   //true
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		
		
		// 4.) Increment/Decrement Opertor-->>   ++, --
		
		
		int m=10;
		int n=20;
		++n;
		System.out.println(n);
		
		--n;
		System.out.println(n);
		
		
		
		int p=5;
		
		//p*=5;
		//p/=2;
		p%=2;
		System.out.println(p);
		
	}

}
