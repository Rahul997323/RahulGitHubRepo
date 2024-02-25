package day4;

public class LargestOf3Number {

	public static void main(String[] args) {
		
		int a=300;
		int b=200;
		int c=100;
		
		if(a>b && b>c)
		{
			System.out.println("a is the largest number:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is the largest number:"+b);
		}
		else
		{
			System.out.println("c is the largest number:"+c);
		}

	}

}
