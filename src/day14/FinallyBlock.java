package day14;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		//String s="welcome";
		String s=null;
		
		try
		{
		//System.out.println(100/num);
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException thrown");
			
		}
		
		finally
		{
		System.out.println("Entered into the finally block");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exit");
	}

}
