package day14;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("you have entered invalid input0");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exit");
	}

}
