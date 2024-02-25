package day14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {


		System.out.println("Program is started");
		System.out.println("program is in progress");
		
		//Example-1
		/*
		Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter a Number:");
				int num=sc.nextInt();
				System.out.println(100/num);
				System.out.println("Program is completed");
				System.out.println("Program is exit");
		*/
		
		//Example-2
		/*
		int a[]=new int[5]; //0....4
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter Position(0-4)");
		int pos=sc.nextInt();
		a[pos]=num;
		System.out.println(a[pos]);
		System.out.println("Program is completed");
		System.out.println("Program is exit");
		
		*/
		
		//Example-3
		
		String a = "1234";
		int num=Integer.parseInt(a);
		System.out.println(num);
		System.out.println("Program is completed");
		System.out.println("Program is exit");
	
		
	}

}
