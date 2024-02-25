package day5;

public class TestingLoopPrintOnly5 {

	public static void main(String[] args) {
		
		/*int i=1;
		
		for(i=1; i<=10; i++)
		{
			if(i==5)
			{
				System.out.println(i);
			}*/
		
		
		//Approach---2
		/*
		int i=1;
		
		for(i=1; i<=10;i++)
		{
			if(i==2 || i==5 || i==10)
			{
				System.out.println(i);
			}*/
		
		//Approach---3
		
		boolean flag=false;
		if(flag)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
			
		}
			else
			
				for(int i=10; i>=1; i--)
				{
					System.out.println(i);
				}
		}

	}


